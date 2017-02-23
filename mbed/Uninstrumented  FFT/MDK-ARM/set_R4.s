    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R4
set_R4
	STR      R4,[sp,#1]
    BX      LR
    END
