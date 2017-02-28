    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R1
set_R1
	STR      R1,[sp,#1]
    BX      LR
    END
