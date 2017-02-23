    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    
	EXPORT get_R12


get_R12
	MOV		R0,R12
	BX      LR
    END