dword printf();

asm "format db '%u', 0";

dword main() {
    dword a;
    a = 0;
    asm "
        ; a = 1 * 2 + 3 * 4
        mov eax, 1 ; eax = 1
        mov ecx, 2 ; ecx = 2
        imul eax, ecx ; eax *= ecx
        ; ecx = 3
        ; edx = 4
        ; ecx *= edx
        ; eax += ecx
        ; a = eax

        a = 1+1+1+1
        eax = 1
        ecx = 1
        eax += ecx


        push .a
        push format
        call printf
        add esp, 12

        mov eax, 0
    ";
}
