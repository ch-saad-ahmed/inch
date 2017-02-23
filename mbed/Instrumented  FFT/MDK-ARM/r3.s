    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT get_R3

get_R3
	MOV		R0,R3
	BX      LR
    END