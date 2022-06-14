#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>


int main(void){
    setlocale(LC_ALL, "Portuguese");

    time_t mytime;
    mytime = time(NULL);
    struct tm tm = *localtime(&mytime);

    char name[30], nameOfVaccine[30];
    int cpf = 0;
    int lote, date;
  
    printf("Digite o seu nome: ");
    fgets(name, 30, stdin);

    printf("Digite o seu cpf: ");
    scanf("%d", &cpf);

    printf("Digite o nome da vacina: ");
    fgets(nameOfVaccine, 30, stdin);

    printf("\n Nome: %s", name);
    printf("\n CPF: %d", cpf);
    printf("\n Vacina: %s", nameOfVaccine);
    printf("\n Data: %d/%d/%d/", tm.tm_mday, tm.tm_mon + 1, tm.tm_year + 1900);
    printf("\n Numero do Lote: %d ", rand() % 1000000);
    printf("\n");
    return 0;
}