    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R0
set_R0
	STR      R0,[sp,#1]
    BX      LR
    END
