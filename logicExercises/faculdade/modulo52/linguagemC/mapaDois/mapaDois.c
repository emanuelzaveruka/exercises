#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <locale.h>
#include <stdio_ext.h>


struct Data {
    int dia;
    int mes;
    int ano;
};

struct cadastro{
    char name[30];
    char cpf[15];
    char nameOfVaccine[30];
    struct Data date;
    int lote[10];
};

int menu, op, i=0, j;
char consulta[12];
char CPF[15];

void flush_in()
{
   int ch;

   while( (ch = fgetc(stdin)) != EOF && ch != '\n' ){}
}

int main(){
    setlocale(LC_ALL, "Portuguese");

    struct cadastro *cadastro = (struct cadastro *) malloc(1*sizeof(struct cadastro));
    if(cadastro == NULL){return -1;};


    do{
        printf("Escolha uma opção:\n 1 - Cadastrar Vacina \n 2 - Listar Aplicações \n 3 - Consultar por CPF \n 4 - Sair \n Digite a opção: ");
        scanf("%d", &menu);
        getc(stdin);
        switch (menu){
            case 1:
            do{
                printf("Digite o seu nome: ");
                fgets(cadastro[i].name, sizeof(cadastro[i].name), stdin);
                cadastro[i].name[strcspn(cadastro[i].name, "\n")] = 0;
                flush_in();


                printf("Digite o seu cpf sem os pontos e sem os traços: ");
                fgets(cadastro[i].cpf, sizeof(cadastro[i].cpf), stdin);
                cadastro[i].cpf[strcspn(cadastro[i].cpf, "\n")] = 0;
                flush_in();

                printf("Digite o nome da vacina: ");
                fgets(cadastro[i].nameOfVaccine, sizeof(cadastro[i].nameOfVaccine), stdin);
                cadastro[i].nameOfVaccine[strcspn(cadastro[i].nameOfVaccine, "\n")] = 0;
                flush_in();
                
                printf("Digite a data no formato dd/mm/yyyy : ");
                scanf("%d/%d/%d", &cadastro[i].date.dia, &cadastro[i].date.mes, &cadastro[i].date.ano);
                flush_in();

                printf("Digite o lote com número inteiros: ");
                fgets(cadastro[i].lote, sizeof(cadastro[i].lote), stdin);
                cadastro[i].lote[strcspn(cadastro[i].lote, "\n")] = 0;
                flush_in();
                
                i++;

                cadastro = (struct cadastro *) realloc(cadastro, (i + 1) * sizeof(struct cadastro));
                if(cadastro == NULL){ return -1;};
            
                printf("continuar? 0-nao, 1-sim:   ");
                scanf("%d", &op);
                flush_in();
            }while(op != 0);
            break;

            case 2:

            for (i; j<i; j++){
                printf("================================================== \n");
                printf(" Código: %d \n", j);
                printf(" Nome: %s \n", cadastro[j].name);
                printf(" Vacina: %s \n", cadastro[j].nameOfVaccine);
                sprintf(CPF, "%c%c%c.%c%c%c.%c%c%c-%c%c",
                    cadastro[j].cpf[0], cadastro[j].cpf[1], cadastro[j].cpf[2],
                    cadastro[j].cpf[3], cadastro[j].cpf[4], cadastro[j].cpf[5],
                    cadastro[j].cpf[6], cadastro[j].cpf[7], cadastro[j].cpf[8],
                    cadastro[j].cpf[9], cadastro[j].cpf[10]
                );
                printf(" CPF: %s \n", CPF);
                printf(" Data: %d/%d/%d \n", cadastro[j].date.dia, cadastro[j].date.mes, cadastro[j].date.ano);
                printf(" Lote: %s", cadastro[j].lote);
                printf("================================================== \n");
                
            }
            j = 0;
            break;

            case 3:

            printf("Digite o CPF para realizar a consulta.\n");
            fgets(consulta, 12, stdin);
            int aux = 0;
            for (i; j<i; j++){
                if (strcmp(consulta, cadastro[j].cpf) == 0){
                printf("O cpf digitado foi encontrado.\n");
                printf("======================================= \n");
                printf(" Código: %d \n", j);
                printf(" Nome: %s \n", cadastro[j].name);
                printf(" Vacina: %s \n", cadastro[j].nameOfVaccine);
                sprintf(CPF, "%c%c%c.%c%c%c.%c%c%c-%c%c",
                    cadastro[j].cpf[0], cadastro[j].cpf[1], cadastro[j].cpf[2],
                    cadastro[j].cpf[3], cadastro[j].cpf[4], cadastro[j].cpf[5],
                    cadastro[j].cpf[6], cadastro[j].cpf[7], cadastro[j].cpf[8],
                    cadastro[j].cpf[9], cadastro[j].cpf[10]
                );
                printf(" CPF: %s \n", CPF);
                printf(" Data: %d/%d/%d \n", cadastro[j].date.dia, cadastro[j].date.mes, cadastro[j].date.ano);
                printf(" Lote: %s \n", cadastro[j].lote);
                printf("======================================= \n");
                aux = 1;
                    break;
                }

                if(j >= i && aux == 0){
                    printf("O cpf digitado não foi encontrado.\n");
                    aux = 1;
                }
            }
            aux = 0;
            j = 0;
            break;

            case 4:
            printf("Saindo do programa... \n");
            break;

            default:
            printf("Opção inválida");
        }
    }while(menu != 4);
    fflush(stdin);
    free(cadastro);
    return 0;
}