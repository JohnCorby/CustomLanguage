extern puts ; extern func

format

globalVar dd 12345678 ; global var

global main ;func
main:
    %define .argc [ebp+8] ; local arg
    %define .a [ebp-4] ; local var
    enter 0, 4

    mov [.argc], 10

    push .msg
    push format
    call puts
    add esp, 4

    leave
    ret
    %undef .argc
    %undef .a

    .msg db 'hello there', 0 ; local static var
    