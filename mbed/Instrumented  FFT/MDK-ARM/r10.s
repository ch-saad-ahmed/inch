    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    
	EXPORT get_R10


get_R10
	MOV		R0,R10
	BX      LR
    END