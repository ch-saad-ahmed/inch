    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    
	EXPORT get_R4


get_R4
	MOV		R0,R4
	BX      LR
    END
