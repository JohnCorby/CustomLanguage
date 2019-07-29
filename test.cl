asm("
    extern puts
    msg db 'hello world', 0
");

dword main() {
    asm("
        push msg
        call puts
        add esp, 4
    ");
}
