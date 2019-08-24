#include <stdio.h>

void main()
{
    volatile int i = 100;
    i = i * i + i * i + (i * i + (i * i + i) * i) + i * i + i;
    // i = i + i + i + i + i + i + i;
    // i = i * i + i * i + i * i + i;
    // i = i + i * i + i * i + i * i;
    // i = i % i;

    // volatile int hello[i];
}