    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R9
set_R9
	STR      R9,[sp,#1]
    BX      LR
    END
