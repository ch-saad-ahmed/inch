    AREA asm_func, CODE, READONLY
; Export my_asm function location so that C compiler can find it and link
    EXPORT set_R8
set_R8
	STR      R8,[sp,#1]
    BX      LR
    END
