    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    
	EXPORT get_R6


get_R6
	MOV		R0,R6
	BX      LR
    END