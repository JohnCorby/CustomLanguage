; generated by compiler

extern printf
; begin asm
format db '%u', 0
; end asm
; begin func main
global main
main:
push ebp
mov ebp, esp
sub esp, 4 ; declare var a
mov dword [ebp-4], 0 ; assign var a
; begin asm

        ; a = 1 * 2 + 3 * 4
        mov eax, 1
        mov edx, 2
        mul edx

        mov [dword [ebp-4]]


        push dword [ebp-4]
        push format
        call printf
        add esp, 12

        mov eax, 0
    
; end asm
mov esp, ebp
pop ebp
ret
; end func main
