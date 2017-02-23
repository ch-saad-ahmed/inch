    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R10
set_R10
	STR      R10,[sp,#1]
    BX      LR
    END
