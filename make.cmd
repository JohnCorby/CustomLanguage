set PATH=%PATH%;D:\mingw\mingw32\bin
set IN="%~dpn1"
nasm -f win32 %IN%.asm -o %IN%.obj
gcc %IN%.obj -o %IN%.exe
