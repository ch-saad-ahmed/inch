    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R12
set_R12
	STR      R12,[sp,#1]
    BX      LR
    END
