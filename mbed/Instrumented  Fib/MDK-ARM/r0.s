    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT get_R0
get_R0
	MOV 	R1,R0
	MOV		R0,R1
	BX      LR
    END



