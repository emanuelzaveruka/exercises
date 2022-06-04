#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    char name, nameOfVaccine;
    int cpf;
    int lote, date;
  
    printf("\n Digite o seu nome");
    scanf("%c", &name);

    printf("\n Digite o seu cpf");
    scanf("%d", &cpf);

    printf("\n Digite o nome da vacina");
    scanf("%c", &nameOfVaccine);
}

