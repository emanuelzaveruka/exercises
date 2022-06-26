#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <locale.h>
#include <stdio_ext.h>
#include <time.h>

struct cadastro{
    char name[30];
    char cpf[12];
    char nameOfVaccine[30];
    char data[11];
};

int op, i=0, j;

int main(){
    setlocale(LC_ALL, "Portuguese");

    struct cadastro *cadastro = (struct cadastro *) malloc(1*sizeof(struct cadastro));
    if(cadastro == NULL){return -1;};

    do{
        
    
    printf("Digite o seu nome: ");
    fgets(cadastro[i].name, 50, stdin);
   
    printf("Digite o seu cpf: ");
    fgets(cadastro[i].cpf, 12, stdin);

    printf("Digite o nome da vacina:");
    fgets(cadastro[i].nameOfVaccine, 30, stdin);

    

    i++;

    cadastro = (struct cadastro *) realloc(cadastro, (i + 1) * sizeof(struct cadastro));
    if(cadastro == NULL){ return -1;};
    
    printf("continuar? 0-nao, 1-sim: ");
    scanf("%d", &op);
    getc(stdin);
        
    }while(op);

    for (i; j<i; j++){
    printf(" Código: %d \n", j);
    printf(" Nome: %s", cadastro[j].name);
    printf(" Vacina: %s", cadastro[j].nameOfVaccine);
    printf(" CPF: %s", cadastro[j].cpf);
    printf("======================================= \n");
    }


    fflush(stdin);
    free(cadastro);
    return 0;
}