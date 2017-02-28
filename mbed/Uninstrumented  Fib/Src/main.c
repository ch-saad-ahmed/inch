/* Includes ------------------------------------------------------------------*/
#include "main.h"
#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
#include<time.h>


UART_HandleTypeDef UartHandle;
__IO uint8_t  ubTxComplete = 0;
__IO uint8_t  ubRxComplete = 0;
#define RX_BUFFER_SIZE                   15
/* Buffer used for transmission */
uint8_t sendmessage[] = "\n\r ****Hello World. ...****\n\r Enter 10 characters using keyboard :\n\r";
uint8_t testmessage[100];
uint8_t sizetest=sizeof(testmessage);
/* Buffer used for reception */
uint8_t aRXBufferA[RX_BUFFER_SIZE];
uint8_t aRXBufferB[RX_BUFFER_SIZE];
__IO uint32_t uwNbReceivedChars = 0;
__IO uint32_t uwBufferReadyIndication = 0;
uint8_t *pBufferReadyForUser;
uint8_t *pBufferReadyForReception;

__IO uint32_t indexofmessage = 0;
uint8_t sizeofmessage = sizeof(sendmessage);
uint8_t aTxEndMessage[] = "\n\r Example Finished\n\r";

/* Buffer used for reception */
uint8_t aRxBuffer[RXBUFFERSIZE];
__IO uint32_t uwRxIndex = 0;
uint32_t checkaddress;
/* Private function prototypes -----------------------------------------------*/
static void SystemClock_Config(void);
void recievemessage(void);
static void Error_Handler(void);
typedef enum {FAILED = 0, PASSED = !FAILED} TestStatus;
void uart_initialize(void);
#define FLASH_PAGE_TO_BE_PROTECTED (OB_WRP1_PAGES32TO47 | OB_WRP1_PAGES48TO63)
uint32_t PageError = 0;
uint32_t ProtectedPAGE = 0x0;
__IO TestStatus MemoryProgramStatus = PASSED;
/*Variable used for Erase procedure*/
static FLASH_EraseInitTypeDef EraseInitStruct;
/*Variable used to handle the Options Bytes*/
static FLASH_OBProgramInitTypeDef OptionsBytesStruct;




// Globals and Funcs
#define ADDR_PSP ((uint32_t)0x08054040)
#define ADDR_MSP ((uint32_t)0x08054044)
#define ADDR_PRIMASK ((uint32_t)0x08054048)
#define ADDR_FAULTMASK  ((uint32_t)0x0805404C)
#define ADDR_BASEPRI ((uint32_t)0x08054050)
#define ADDR_CONTROL ((uint32_t)0x08054054)
#define STARTRAMADDRESS ((uint32_t)0x20000000)
#define RAMEND  ((uint32_t)0x20014000)
#define FLASH_USER_START_ADDR       ((uint32_t)0x08040000)   /* Start @ of user Flash area */
#define FLASH_USER_END_ADDR ((uint32_t)0x08054100)// last page
#define SetBit(k)   ( A[(k/32)] |= (1 <<  k%32) )
#define ClearBit(k) ( A[(k/32)] &= ~(1 << k%32) )
#define TestBit(k)  ( A[(k/32)]>>k%32 & 1)


extern void fromflash(uint32_t * y);
extern void asm_setregisters();
void general_purpose();
void setReg();
void writeReg();
void revive();
void print(char *message);
void mem_map(int *curr_addr,int length);
void mem_mapd(double* curr_addr,int len);
void writeinflash(uint32_t *Registers);
void Magic_No(uint32_t address, int value);
uint32_t * getReg();


char string[40];
uint32_t ramaddrs, Address = 0, flag1 = 0, st =0, bp =0, sp, Registers[22], A[2560]; // A ==> bit_array_map
unsigned int spReg, lrReg, pcReg;
int firstCheckPoint = 0;

//FFT vars
#define TWOPI 6.283185
int j=0;
// Fib vars
int FCN = 0;



int fibonacci(int term){
	
    /* Exit condition of recursion*/
    if(term < 2)
			return term;
		
		int fib1 = fibonacci(term - 1);
		int fib2 = fibonacci(term - 2);
    return fib1 + fib2;
}

void main()
{
    
    HAL_Init();
    /* Configure the system clock to 32 MHz */
    SystemClock_Config();
    /* Configure leds */
    BSP_LED_Init(LED2);
    BSP_LED_On(LED2);
    uart_initialize();
	
		sprintf(string, "Fibonacci(30) = %d \r\n",fibonacci(30));
		print(string);
}

void erase_pages(uint32_t address)
{
    //	MemoryProgramStatus = PASSED;
    /* Unlock the Flash to enable the flash control register access *************/
    HAL_FLASH_Unlock();
    /* Unlock the Options Bytes *************************************************/
    HAL_FLASH_OB_Unlock();
    /* Get pages write protection status ****************************************/
    HAL_FLASHEx_OBGetConfig(&OptionsBytesStruct);
    
    /* Lock the Options Bytes *************************************************/
    HAL_FLASH_OB_Lock(); //not seen over there
    
    /* The selected pages are not write protected *******************************/
    if ((OptionsBytesStruct.WRPSector0To31) == 0x00)
    {
        /* Fill EraseInit structure************************************************/
        EraseInitStruct.TypeErase   = FLASH_TYPEERASE_PAGES;
        EraseInitStruct.PageAddress = address;
        EraseInitStruct.NbPages = 1;
        
        HAL_FLASHEx_Erase(&EraseInitStruct, &PageError);
    }
}

void Magic_No(uint32_t address, int value)
{
    erase_pages(address);
    if (HAL_FLASH_Program(FLASH_TYPEPROGRAM_WORD, address, value) != HAL_OK)
		{
        sprintf(string,"Unable to update the checkpoint variable! \r\n");
        print(string);
    }    
		
    HAL_FLASH_Lock();
}
void mem_map(int *curr_addr,int length)
{
    uint32_t addr = (__IO uint32_t) curr_addr;
    memset(string, 0, sizeof string);
    for (uint32_t byte_no=0; byte_no<length; byte_no++)
    {
        SetBit(addr%STARTRAMADDRESS);    
        addr++;
    }
}
void mem_mapd(double *curr_addr,int length)
{
    uint32_t addr = (__IO uint32_t) curr_addr;
    memset(string, 0, sizeof string);
    for (uint32_t byte_no=0; byte_no<length; byte_no++)
    {
        SetBit(addr%STARTRAMADDRESS);
        addr++;
    }
}


void revive()
{
    Address =FLASH_USER_START_ADDR;
    ramaddrs = STARTRAMADDRESS;
    while (ramaddrs < RAMEND)
    {
        if ((uint32_t)(&Address) != ramaddrs && (uint32_t)&ramaddrs != ramaddrs && (uint32_t)&flag1 != ramaddrs )
            
        {
            *(__IO uint32_t*) ramaddrs = *(__IO uint32_t*) Address;
        }
        ramaddrs +=4;
        Address +=4;
    }
    // reset the memory map array to zero while reviving
    for (int i=0;i<2560;i++)
        A[i] = 0;  
    setReg();
}

void setReg()
{
    general_purpose();
    __set_PRIMASK (*(__IO uint32_t*)ADDR_PRIMASK);
    __set_BASEPRI (*(__IO uint32_t*)ADDR_BASEPRI);
    __set_FAULTMASK (*(__IO uint32_t*)ADDR_FAULTMASK);
    __set_CONTROL (*(__IO uint32_t*)ADDR_CONTROL);
    __set_PSP (*(__IO uint32_t*)ADDR_PSP);
    __set_MSP (*(__IO uint32_t*)ADDR_MSP);
    asm_setregisters();
}


void writeinflash(uint32_t* Registers)
{
    
    MemoryProgramStatus = PASSED;
    /* Unlock the Flash to enable the flash control register access *************/
    HAL_FLASH_Unlock();
    __HAL_FLASH_CLEAR_FLAG(FLASH_FLAG_OPTVERR); // added by me
    /* Unlock the Options Bytes *************************************************/
    HAL_FLASH_OB_Unlock();
    /* Get pages write protection status ****************************************/
    HAL_FLASHEx_OBGetConfig(&OptionsBytesStruct);
    
    
    /* Lock the Options Bytes *************************************************/
    HAL_FLASH_OB_Lock(); //not seen over there
    
    /* The selected pages are not write protected *******************************/
    if ((OptionsBytesStruct.WRPSector0To31) == 0x00)
    {
        
        if (*(__IO uint32_t*) 0x08055000 != 1590)
        {
            /* Fill EraseInit structure************************************************/
            EraseInitStruct.TypeErase   = FLASH_TYPEERASE_PAGES;
            EraseInitStruct.PageAddress = FLASH_USER_START_ADDR;
            EraseInitStruct.NbPages     = (FLASH_USER_END_ADDR - FLASH_USER_START_ADDR)/FLASH_PAGE_SIZE;
            
            if (HAL_FLASHEx_Erase(&EraseInitStruct, &PageError) != HAL_OK)
            {
                /*
                Error occurred while page erase.
                User can add here some code to deal with this error.
                PageError will contain the faulty page and then to know the code error on this page,
                user can call function 'HAL_FLASH_GetError()'
                */
                while (1)
                {
                    /* Make LED2 blink (100ms on, 2s off) to indicate error in Erase operation */
                    BSP_LED_On(LED2);
                    HAL_Delay(100);
                    BSP_LED_Off(LED2);
                    HAL_Delay(2000);
                }
            }
        }
        int no_pages_mod = 0;
        int no_bytes_mod = 0;
        Address = FLASH_USER_START_ADDR;
        uint32_t ramaddress = STARTRAMADDRESS;
        uint32_t addr_A = (uint32_t)(A);
        if (*(__IO uint32_t*) 0x08055000 != 1590)
        {
            while (ramaddress < RAMEND)
            {
                if (ramaddrs < addr_A || ramaddrs > addr_A + 2559)
                {
                    if (HAL_FLASH_Program(FLASH_TYPEPROGRAM_WORD, Address, *(__IO uint32_t*) ramaddress) == HAL_OK)
                    {
                        Address = Address + 4;
                        ramaddress += 4;
                    }
                    else
                    {
                        /* Error occurred while writing data in Flash memory.
                        User can add here some code to deal with this error */
                        while (1)
                        {
                            /* Make LED2 blink (100ms on, 2s off) to indicate error in Write operation */
                            BSP_LED_On(LED2);
                            HAL_Delay(100);
                            BSP_LED_Off(LED2);
                            HAL_Delay(2000);
                        }
                    }
                }
            }
        }
        else if (*(__IO uint32_t*) 0x08055000 == 1590) // Previous successful Checkpoint exists
        {
            int checker = 0;
            
            for (int i=0; i<2560;i+=8)
            {
                checker = 0;
                for (j=i; j<i+8; j++)
                {
                    if (A[j] != 0)
                    {
                        checker = 1 ;
                    }
                }
                
                if (checker ==1)
                {
                    no_pages_mod++;
                    ramaddress = STARTRAMADDRESS + (i/8)*256 ;
                    Address = FLASH_USER_START_ADDR + (i/8)*256 ;
                    int ending = ramaddress+256;
                    erase_pages(Address);
                    while (ramaddress < ending ) // for i = 1 - 2560 ; if A[i]
                    {
                        // for > i*32 + startram && < startram + (i+1) * 32 ; test(i)
                        
                        
                        if (HAL_FLASH_Program(FLASH_TYPEPROGRAM_WORD, Address, *(__IO uint32_t*) ramaddress) == HAL_OK)
                        {
                            Address = Address + 4;
                            ramaddress += 4;
                        }
                        else
                        {
                            /* Error occurred while writing data in Flash memory.
                            User can add here some code to deal with this error */
                            while (1)
                            {
                                /* Make LED2 blink (100ms on, 2s off) to indicate error in Write operation */
                                BSP_LED_On(LED2);
                                HAL_Delay(100);
                                BSP_LED_Off(LED2);
                                HAL_Delay(2000);
                            }
                        }
                    }
                }
            }
        }
        // Reseting the Array & ST
        
        for (int i=0;i<81920;i++)
        {
            if (TestBit(i) != 0)
            {
                no_bytes_mod++;
            }
        }
        
//        memset(string, 0, sizeof string);
//        sprintf(string, "Pages: Bytes: %d %d \r\n",no_pages_mod,no_bytes_mod );
//        print(string);
        
        
        
        for (int i=0;i<2560;i++)
            A[i] = 0;
        
        //		st = bp;
        
        ///////////////// Sotring Registers to flash here /////////////////
        unsigned int lr = __return_address();
        Registers[15] = lr;
        Address =	(uint32_t)0x08054000;
        erase_pages(0x08054000);
        int i =0;
        while (Address <= 0x08054054)
        {
            if (HAL_FLASH_Program(FLASH_TYPEPROGRAM_WORD, Address, Registers[i]) == HAL_OK)
            {
                Address = Address + 4;
                i++;
            }
            
            else
            {
                /* Error occurred while writing data in Flash memory.
                User can add here some code to deal with this error */
                while (1)
                {
                    /* Make LED2 blink (100ms on, 2s off) to indicate error in Write operation */
                    BSP_LED_On(LED2);
                    HAL_Delay(100);
                    BSP_LED_Off(LED2);
                    HAL_Delay(2000);
                }
            }
            
        }
        //HAL_FLASH_Program(FLASH_TYPEPROGRAM_WORD, 0x08055000, 1690);
        // asserting a checkpoint was indeed done by writing at 0x8054058
        
        /* Lock the Flash to disable the flash control register access (recommended
        to protect the FLASH memory against possible unwanted operation) *********/
        HAL_FLASH_Lock();
    }
    Magic_No(0x08055000, 1590);
    
}

void print(char *message){
    
    if(HAL_UART_Transmit(&UartHandle, (uint8_t*)message, sizeof(string), 1000)!= HAL_OK)
    {
        /* Transfer error in transmission process */
        Error_Handler();
    }
    
    /* Checks if Buffer full indication has been set */
    if (uwBufferReadyIndication != 0)
    {
        /* Reset indication */
        uwBufferReadyIndication = 0;
        
        /* USART IRQ handler is not anymore routed to HAL_UART_IRQHandler() function
        and is now based on LL API functions use.
        Therefore, use of HAL IT based services is no more possible : use TX HAL polling services */
        if(HAL_UART_Transmit(&UartHandle, (uint8_t*)pBufferReadyForUser, RX_BUFFER_SIZE, 1000)!= HAL_OK)
        {
            /* Transfer error in transmission process */
            Error_Handler();
        }
        
        /* Toggle LED2 */
        BSP_LED_Toggle(LED2);
    }
    
    /* Manage temporisation between TX buffer sendings */
    HAL_Delay(50);
    
}



void SystemClock_Config(void)
{
    RCC_ClkInitTypeDef RCC_ClkInitStruct = {0};
    RCC_OscInitTypeDef RCC_OscInitStruct = {0};
    
    /* Enable HSE Oscillator and Activate PLL with HSE as source */
    RCC_OscInitStruct.OscillatorType      = RCC_OSCILLATORTYPE_HSI;
    RCC_OscInitStruct.HSIState            = RCC_HSI_ON;
    RCC_OscInitStruct.HSICalibrationValue = RCC_HSICALIBRATION_DEFAULT;
    RCC_OscInitStruct.PLL.PLLState        = RCC_PLL_ON;
    RCC_OscInitStruct.PLL.PLLSource       = RCC_PLLSOURCE_HSI;
    RCC_OscInitStruct.PLL.PLLMUL          = RCC_PLL_MUL6;
    RCC_OscInitStruct.PLL.PLLDIV          = RCC_PLL_DIV3;
    if (HAL_RCC_OscConfig(&RCC_OscInitStruct) != HAL_OK)
    {
        /* Initialization Error */
        while(1);
    }
    
    /* Set Voltage scale1 as MCU will run at 32MHz */
    __HAL_RCC_PWR_CLK_ENABLE();
    __HAL_PWR_VOLTAGESCALING_CONFIG(PWR_REGULATOR_VOLTAGE_SCALE1);
    
    /* Poll VOSF bit of in PWR_CSR. Wait until it is reset to 0 */
    while (__HAL_PWR_GET_FLAG(PWR_FLAG_VOS) != RESET) {};
    
    /* Select PLL as system clock source and configure the HCLK, PCLK1 and PCLK2
    clocks dividers */
    RCC_ClkInitStruct.ClockType = (RCC_CLOCKTYPE_SYSCLK | RCC_CLOCKTYPE_HCLK | RCC_CLOCKTYPE_PCLK1 | RCC_CLOCKTYPE_PCLK2);
    RCC_ClkInitStruct.SYSCLKSource = RCC_SYSCLKSOURCE_PLLCLK;
    RCC_ClkInitStruct.AHBCLKDivider = RCC_SYSCLK_DIV1;
    RCC_ClkInitStruct.APB1CLKDivider = RCC_HCLK_DIV1;
    RCC_ClkInitStruct.APB2CLKDivider = RCC_HCLK_DIV1;
    if (HAL_RCC_ClockConfig(&RCC_ClkInitStruct, FLASH_LATENCY_1) != HAL_OK)
    {
        /* Initialization Error */
        while(1);
    }
}


static void Error_Handler(void)
{
    /* Turn LED2 to off for error */
    BSP_LED_Off(LED2);
    while(1)
    {
    }
}
void recievemessage(){
    if(HAL_UART_Transmit(&UartHandle, (uint8_t*)aRxBuffer, RXBUFFERSIZE, 1000)!= HAL_OK)
    {
        /* Transfer error in transmission process */
        Error_Handler();
    }
    
    /*##-6- Send the End Message ###############################################*/
    if(HAL_UART_Transmit(&UartHandle, (uint8_t*)aTxEndMessage, TXENDMESSAGESIZE, 1000)!= HAL_OK)
    {
        /* Transfer error in transmission process */
        Error_Handler();
    }}
    
    
    void UART_CharReception_Callback(void)
    {
        uint8_t *ptemp;
        
        /* Read Received character. RXNE flag is cleared by reading of DR register */
        pBufferReadyForReception[uwNbReceivedChars++] = LL_USART_ReceiveData8(USARTx);
        
        /* Checks if Buffer full indication has to be set */
        if (uwNbReceivedChars >= RX_BUFFER_SIZE)
        {
            /* Set Buffer swap indication */
            uwBufferReadyIndication = 1;
            
            /* Swap buffers for next bytes to be received */
            ptemp = pBufferReadyForUser;
            pBufferReadyForUser = pBufferReadyForReception;
            pBufferReadyForReception = ptemp;
            uwNbReceivedChars = 0;
        }
    }
    
    
    
    void UART_TXEmpty_Callback(void)
    {
        if(indexofmessage == (sizeofmessage - 1))
        {
            /* Disable TXE interrupt */
            LL_USART_DisableIT_TXE(USARTx);
            
            /* Enable TC interrupt */
            LL_USART_EnableIT_TC(USARTx);
        }
        
        /* Fill DR with a new char */
        LL_USART_TransmitData8(USARTx, string[indexofmessage++]);
    }
    
    /**
    * @brief  Function called at completion of last byte transmission
    * @retval None
    */
    void UART_CharTransmitComplete_Callback(void)
    {
        if(indexofmessage == sizeof(string))
        {
            indexofmessage = 0;
            
            /* Disable TC interrupt */
            LL_USART_DisableIT_TC(USARTx);
            
            /* Set Tx complete boolean to 1 */
            ubTxComplete = 1;
        }
    }
    
    /**
    * @brief  UART error callbacks
    * @note   This example shows a simple way to report transfer error, and you can
    *         add your own implementation.
    * @retval None
    */
    void UART_Error_Callback(void)
    {
        __IO uint32_t sr_reg;
        
        /* Disable USARTx_IRQn */
        NVIC_DisableIRQ(USARTx_IRQn);
        
        /* Error handling example :
        - Read USART SR register to identify flag that leads to IT raising
        - Perform corresponding error handling treatment according to flag
        */
        sr_reg = LL_USART_ReadReg(USARTx, SR);
        if (sr_reg & LL_USART_SR_NE)
        {
            /* Turn LED2 off: Transfer error in reception/transmission process */
            BSP_LED_Off(LED2);
        }
        else
        {
            /* Turn LED2 off: Transfer error in reception/transmission process */
            BSP_LED_Off(LED2);
        }
    }
    
    
    
    void uart_initialize(){
        
        UartHandle.Instance        = USARTx;
        
        UartHandle.Init.BaudRate   = 9600;
        UartHandle.Init.WordLength = UART_WORDLENGTH_8B;
        UartHandle.Init.StopBits   = UART_STOPBITS_1;
        UartHandle.Init.Parity     = UART_PARITY_ODD;
        UartHandle.Init.HwFlowCtl  = UART_HWCONTROL_NONE;
        UartHandle.Init.Mode       = UART_MODE_TX_RX;
        
        if(HAL_UART_Init(&UartHandle) != HAL_OK)
        {
            /* Initialization Error */
            Error_Handler();
        }
        
        pBufferReadyForReception = aRXBufferA;
        pBufferReadyForUser      = aRXBufferB;
        uwNbReceivedChars = 0;
        uwBufferReadyIndication = 0;
        /* Enable RXNE and Error interrupts */
        LL_USART_EnableIT_RXNE(USARTx);
        LL_USART_EnableIT_ERROR(USARTx);
        
        /*##-3- Start the transmission process (using HAL Polling mode) #############*/
        /* In main loop, Tx buffer is sent every 0.5 sec.
        As soon as RX buffer is detected as full, received bytes are echoed on TX line to PC com port */
    }
    #ifdef  USE_FULL_ASSERT
    
    void assert_failed(uint8_t* file, uint32_t line)
    {
        /* User can add his own implementation to report the file name and line number,
        ex: printf("Wrong parameters value: file %s on line %d\r\n", file, line) */
        
        /* Infinite loop */
        while (1)
        {
        }
    }
    #endif
    