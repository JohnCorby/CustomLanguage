export IN=${1%.*}

nasm -f elf32 "$IN".asm -o "$IN".o &&
  gcc -m32 "$IN".o -o "$IN"
