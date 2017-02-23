
#include "Timer.h"

module SenseC
{
  uses {
    interface Boot;
    interface Leds;
    interface Timer<TMilli>;
    interface Timer<TMilli> as Timer1;
    interface Read<uint16_t>;
    interface Random;
  }
}
implementation
{ 
  int countAvrg = 0;
  int avrg = 0;
  int arrInd = 0;
  int sampleArray[800];
  uint32_t randTime = 0;

  event void Boot.booted() {
     avrg = 0;
     call Timer.startOneShot(1)
    
  }

  event void Timer.fired() 
  {
    call Read.read();


  }

 event void Timer1.fired() 
  {

      call Leds.led0Toggle();

  }

  event void Read.readDone(error_t result, uint16_t data) 
  {
     
     int loopCounter = 0;
    countAvrg++;
    arrInd =  arrInd % 800;
    countAvrg =  countAvrg % 800;
    sampleArray[arrInd] = data;
    int sum = 0;
     for(loopCounter =0;loopCounter<countAvrg;loopCounter++ )
          sum += sampleArray[loopCounter];

      avrg = sum/countAvrg;
      randomTime = call Random.rand16() % 1000;
      arrInd++;
      call Timer.startOneShot(randomTime);
  }

}

