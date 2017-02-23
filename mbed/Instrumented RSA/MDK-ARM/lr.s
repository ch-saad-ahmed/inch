    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_lr
set_lr
	STR      R1,[sp,#1]
	
	MOV		LR,R1
    BX      LR
    END