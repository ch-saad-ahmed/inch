    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT get_R2


get_R2
	MOV		R0,R2
	BX      LR
    END