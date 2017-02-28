    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    
	EXPORT get_R11


get_R11
	MOV		R0,R11
	BX      LR
    END