    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_pc
set_pc
	STR      R1,[sp,#1]
	
	MOV		pc,R1
    BX      LR
    END