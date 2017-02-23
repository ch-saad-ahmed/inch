This is the instrumented version of RSA.

This has two checkpoint calls. First at the start of the RSA function
Second before calling the decrypt function.

RSA's functions are:
	prime
	ce
	cd
	encrypt
	decrypt

Our (Inch Scheme's) functions are:
	
	fromflash(uint32_t * y);
	asm_setregisters();
	general_purpose();
	setReg();
	writeReg();
	revive();
	print(char *message);
	mem_map(int *curr_addr,int length);
	mem_mapd(double* curr_addr,int len);
	writeinflash(uint32_t *Registers);
	Magic_No(uint32_t address, int value);
	uint32_t * getReg();

mem_map is ued for setting the bits of the bit map array (A) to 1
mem_mapd does the same but for a double (could have been done with a single mem_map)
revive is called for reviving from the last available checkpoint. Moves Flash data -> RAM, sets registers
Magic_No For writing a special no at a special mem location in flash to indicate if a checkpoint is available or not
print for impltementing a print for mbed (device l152 re)
writeinflash Writes the updated portion of RAM since last Checkpoint to Flash