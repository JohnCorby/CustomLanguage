; begin asm

    extern puts
    msg db 'hello world', 0

; end asm
; begin func main
global main
main:
push ebp
mov ebp, esp
; begin asm

        push msg
        call puts
        add esp, 4
    
; end asm
mov esp, ebp
pop ebp
ret
; end func main
