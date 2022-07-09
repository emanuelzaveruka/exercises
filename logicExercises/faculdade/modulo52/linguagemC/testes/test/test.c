#include <stdio.h>

/* int ler_data(int* dia, int* mes, int* ano);
   Le uma data nas variaveis dia, mes, ano
   Se a função retornar 0, os valores dia, mes, ano são numéricos e estão com os valores inseridos pelo usuário
   Se a função retornar 1, ocorreu um erro de leitura e as variáveis dia, mes, ano podem conter lixo!
*/
int ler_data(int* dia, int* mes, int* ano) {
  char input[1024];
  int valida;

  fgets(input, 1024, stdin);
  valida = sscanf(input, "%d/%d/%d\n", dia, mes, ano);

  return (valida == 3) ? 0 : 1; 
}

/* int valida_data(int dia, int mes, int ano);
   Valida os valores dia, mes e ano
   Se a função retornar 0, todos os valores foram validados
   Se a função retornar 1, ocorreu um problema de validação com o dia (isso não garante que o mês e o ano estejam corretos!)
   Se a função retornar 2, ocorreu um problema de validação com o mês (isso não garante que o ano esteja correto!)
   Se a função retornar 3, ocorreu um problema de validação com o ano
*/
int validar_data(int dia, int mes, int ano) {
  if(dia > 31 || dia < 1) {
    return 1;
  }

  if(mes > 12 || mes < 1) {
    return 2;
  }

  if(ano < 1) {
    return 3;
  }

  return 0;
}

int main(void) {
  int dia, mes, ano;

  while(ler_data(&dia, &mes, &ano) || validar_data(dia, mes, ano));

  printf("%d/%d/%d\n", dia, mes, ano);
  return 0;
}