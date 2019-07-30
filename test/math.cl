dword printf();

asm "format db '%u', 0";

dword main() {
    dword a;
    a = 0;
    asm "
        ; a = 1 * 2 + 3 * 4
        mov eax, 1
        mov edx, 2
        mul edx

        mov [.a]


        push .a
        push format
        call printf
        add esp, 12

        mov eax, 0
    ";
}
