    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    
	EXPORT get_R7


get_R7
	MOV		R0,R7
	BX      LR
    END