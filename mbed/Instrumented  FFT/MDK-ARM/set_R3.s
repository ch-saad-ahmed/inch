    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R3
set_R3
	STR      R3,[sp,#1]
    BX      LR
    END
