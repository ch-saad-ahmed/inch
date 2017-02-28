    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R6
set_R6
	STR      R6,[sp,#1]
    BX      LR
    END
