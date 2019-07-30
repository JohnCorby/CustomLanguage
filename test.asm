; begin asm

    extern printf, puts
    format db 'addr of msg is %p', 10, 0
    msg db 'hello world', 0

; end asm
; begin func main
global main
main:
push ebp
mov ebp, esp
sub esp, 4 ; declare var format
sub esp, 4 ; declare var msg
; begin asm

        mov dword [ebp+4], format
        mov dword [ebp+8], msg

        push dword [ebp+8]
        push dword [ebp+4]
        call printf
        add esp, 8

        push dword [ebp+8]
        call puts
        add esp, 4
    
; end asm
mov esp, ebp
pop ebp
ret
; end func main
