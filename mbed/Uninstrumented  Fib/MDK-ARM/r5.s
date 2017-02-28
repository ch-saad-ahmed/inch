    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    
	EXPORT get_R5


get_R5
	MOV		R0,R5
	BX      LR
    END