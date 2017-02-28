    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT get_LR
get_LR
	MOV		R0,LR
	BX      LR
    END



