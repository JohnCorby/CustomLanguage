dword printf();

asm "format db '%u', 0";

dword main() {
    dword a = 1*1+1*1+(1*1+(1*1+1)*1)+1*1+1;
    asm "
        push .a
        push format
        call printf
        add esp, 12

        mov eax, 0
    ";
}
