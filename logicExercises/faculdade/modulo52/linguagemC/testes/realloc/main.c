#include <stdio.h>
#include <stdlib.h>

int main(){

    float *vet;
    int i, tam;

    vet = (float *) malloc(tam * sizeof(float));

    if (vet == NULL) return -1;


    for (i = 0; i < tam; i++){
        scanf("%f", vet+tam);
        //ao realocar, remove o ultimo elementto o vetor vet
        vet = (float *) realloc(vet, (tam - 1) * sizeof(float));

        if(vet == NULL) return -1;
        free(vet);
    }
}