    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    
	EXPORT get_R9


get_R9
	MOV		R0,R9
	BX      LR
    END