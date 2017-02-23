    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R7
set_R7
	STR      R7,[sp,#1]
    BX      LR
    END
