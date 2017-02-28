    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R2
set_R2
	STR      R2,[sp,#1]
    BX      LR
    END
