   AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT general_purpose
general_purpose

	LDR 	R0,=0x08054000
	LDR		R1,[R0]
	LDR 	R0,=0x08054004
	LDR		R1,[R0]
	LDR 	R0,=0x08054008
	LDR		R2,[R0]
	LDR 	R0,=0x0805400C
	LDR		R3,[R0]
	LDR 	R0,=0x08054010
	LDR		R4,[R0]
	LDR 	R0,=0x08054014
	LDR		R5,[R0]
	LDR 	R0,=0x08054018
	LDR		R6,[R0]
	
	LDR 	R0,=0x0805401C
	LDR		R7,[R0]
	LDR 	R0,=0x08054020
	LDR		R8,[R0]
	LDR 	R0,=0x08054024
	LDR		R9,[R0]
	LDR 	R0,=0x08054028
	LDR		R10,[R0]
	
	LDR 	R0,=0x0805402C
	LDR		R11,[R0]
	LDR 	R0,=0x08054030
	LDR		R12,[R0]
	BX      LR
    END