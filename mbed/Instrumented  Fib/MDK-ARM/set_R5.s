    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R5
set_R5
	STR      R5,[sp,#1]
    BX      LR
    END
