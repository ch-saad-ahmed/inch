    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R11
set_R11
	STR      R11,[sp,#1]
    BX      LR
    END
