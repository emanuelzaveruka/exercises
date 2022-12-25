#include <stdio.h>
#include <stdlib.h>

int main(){

    int  * vet, i=0, op, j=0;

    vet = (int*)malloc(sizeof(int));

    if(vet==NULL){ return -1; };

    do{
        printf("diga um numero");
        scanf("%i", vet+i);

        i++;

        vet = (int*) realloc(vet, (i+1) * sizeof(int));

        if(vet==NULL){ return -1; };

        printf("continuar? 0-nao, 1-sim");
        scanf("%i", &op);
        
    }while(op);
    vet = (int*) realloc(vet, (i) * sizeof(int));
    for(j; j<= i; j++) {
        printf("%i", vet[j]);
    }

    free(vet);
}