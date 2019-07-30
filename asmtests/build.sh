nasm -f elf32 -g -F dwarf main.asm -o main.o &&
  gcc -m32 main.o -o main
