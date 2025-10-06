#include <stdio.h>
#include <time.h>

int main(void) {
    printf("Test program\n");
    char buffer [80];
    scanf("%[^\n]", buffer);
    printf("Val : %s\n", buffer);

    clock_t start = clock();

    for (int i = 0; i < 1000000000; i++) {

    }
    clock_t end = clock();

    printf("Time : %f s\n", (float)(end - start) / CLOCKS_PER_SEC);
    return 0;
}