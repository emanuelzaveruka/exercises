program project1;
uses crt;
var
   x:real;
      i, aux, ao:integer;
begin
  //
  //colocando valores nas variaveis para não se tornarem nulas
  //
  aux:=0;
  ao:=0;
  i:=0;
  //
  //input (entrada de valor)
  //
  writeln ('algoritmo que escreva numero em notacao cientifica');
  writeln ('com tres algarismos significativos');
  writeln;
  writeln ('escreva de forma correta colocando o ponto no lugar da virgula');
          writeln ('digite o valor de forma positiva para notacao cientifica');
                  read (x);
  //
  //input (fim de entrada de valores)
  //
  //
  //logica "1"
  //
  {lógica que indentifica se o numero tem tamanho necessario para reduzir se não
          imprime mensagem informando usuario}
  if (x>=1) then
  begin
       if (x<=10) then
       begin
       writeln;
               writeln('esse numero nao e significativo');
                       writeln;
                               writeln ('nao e necessario reduzir seu tamanho');
                       writeln;
               writeln ('mas respeitando o exercicio esvreve-se assim');
       writeln (x:1:2);
       end;
  end;
  {fim de logica "1" e inicio de lógica que indentifica o valor e reduz de forma
       de acordo com o valor digitado}
  //
  //logica "2"
  //
  {nessa lógica o valor e reduzido em potencias de baze 10}
  while (x>10) do
  begin
   x:=x/10;
    i:=i+1;
   ao:=1 ;
  end;
  //
  //logica "3"
  //
  {nessa lógica o valor e multiplicado em 10 até atingir o valor necessario}
  while (x<1) do
  begin
   x:=x*10;
    i:=i+1;
   aux:=+1;
  end;
  //
  //output (saida de valores)
  //
  {de acordo com a resposta da lógica "2" e "3" aqui seria formada a resposta ao usuario}
  if (aux=1) then
  begin
       writeln (x:1:2,'  *10^ - ',i);
  end;
  if (ao=1) then
  begin
       writeln (x:1:2,'  *10^',i);
  end;
  //
  //output (fim de saida de valores)
  //
  readkey;
end.
//desenvolvido por EZS
