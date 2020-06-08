Running DemonstrationKt produces:

```stacktrace
FirstTest(ignored=)
SecondTest(ignored=)
ThirdTest(ignored=)
FourthTest(ignored=)
FifthTest(ignored=)
Exception in thread "main" java.lang.VerifyError: Bad type on operand stack
Exception Details:
  Location:
    VerifyErrorOne.b-impl(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; @45: invokespecial
  Reason:
    Type 'java/lang/String' (current frame, stack[2]) is not assignable to 'VerifyErrorOne'
  Current Frame:
    bci: @45
    flags: { }
    locals: { 'java/lang/String', 'kotlin/coroutines/Continuation' }
    stack: { uninitialized 39, uninitialized 39, 'java/lang/String', 'kotlin/coroutines/Continuation' }
  Bytecode:
    0000000: 2bc1 0024 9900 232b c000 243a 0419 04b4
    0000010: 0028 1229 7e99 0012 1904 59b4 0028 1229
    0000020: 64b5 0028 a700 0ebb 0024 592a 2bb7 002c
    0000030: 3a04 1904 b400 304e b800 363a 0519 04b4
    0000040: 0028 aa00 0000 004b 0000 0000 0000 0001
    0000050: 0000 0016 0000 0035 2db8 003c 2a19 0419
    0000060: 042a b500 3f19 0404 b500 28b8 0041 5919
    0000070: 05a6 0014 1905 b019 04b4 003f c000 434b
    0000080: 2db8 003c 2dc0 0043 4db2 0049 b0bb 004b
    0000090: 5912 4db7 004f bf                      
  Stackmap Table:
    same_frame(@39)
    append_frame(@50,Top,Top,Object[#36])
    full_frame(@88,{Object[#67],Object[#84],Top,Object[#4],Object[#36],Object[#4]},{})
    same_frame(@119)
    same_locals_1_stack_item_frame(@133,Object[#4])
    same_frame(@141)

	at DemonstrationKt.main(Demonstration.kt:62)
	at DemonstrationKt.main(Demonstration.kt)
```