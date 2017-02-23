    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_sp
set_sp
	STR      R1,[sp,#1]
	
	MOV		sp,R1
    BX      LR
    END