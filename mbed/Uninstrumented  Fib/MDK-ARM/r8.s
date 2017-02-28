    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    
	EXPORT get_R8


get_R8
	MOV		R0,R8
	BX      LR
    END