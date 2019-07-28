export IN="${1%.*}"

# make
nasm -f elf32 $IN.asm -o $IN.o
gcc -m32 $IN.o -o $IN

# clean
#rm $IN.asm
#rm $IN.o
