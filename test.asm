; begin func main
global main
main:
push ebp
mov ebp, esp
sub esp, 1 ; declare var var1
sub esp, 2 ; declare var var2
sub esp, 4 ; declare var var3
mov BYTE [ebp+8], 1 ; assign var arg1
mov WORD [ebp+12], 2 ; assign var arg2
mov DWORD [ebp+16], 3 ; assign var arg3
mov BYTE [ebp-1], 4 ; assign var var1
mov WORD [ebp-3], 5 ; assign var var2
mov DWORD [ebp-7], 6 ; assign var var3
mov esp, ebp
pop ebp
ret
; end func main
