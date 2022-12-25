#include <stdio.h>
#include <stdlib.h>

/*Alocação dinâmica em c*/

int main() {
    int *vet, i = 0, tam, op;

    do {
        /*Definindo tamanho da alocação*/
        printf("Quantos nums vai digitar?");
        scanf("%i", &tam);
        /*Alocando dinamicamente o tamanho do vetor*/
        vet = (int*)malloc(tam*sizeof(int));
        /*Verificando se o vetor foi alocado*/
        if (vet == NULL) {
            return -1; /*Caso não tenha sido alocado informa ao S.O o erro*/
        }

        /*Iterando sobre o vetor*/
        for (i = 0; i <tam; i++) {
            printf("informe um número:");
            scanf("%i", vet+1);
        }

        /*Liberando o espaço alocado no endereço*/
        free(vet);

        printf("continuar? 0-nao, 1-sim");
        scanf("%i", &op);

    }while(op);
}
