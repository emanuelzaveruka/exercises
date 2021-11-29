program ex4;
uses crt;
//
//variaveis globais
//
Var
  //
  vet: array [1..20] of integer;
  x, y, i, aux, posicao:integer;
begin
  //
  //Introduzido valor lógico
  //
  aux:=0;
  //
  //Itroduzindo valor no vetor
  //
    for i:=1 to 20 do
    begin
     writeln ('Digite um Valor inteiro positivo');
        read (x);
     vet[i]:=x;
    end;
  //
  //imprimindo informão para usuario
  //
    for i:=1 to 20 do
    begin
     writeln;
        writeln(vet[i],' - Posicao - ',i);
    end;
  //
  //Variavel de comparação
  //
  writeln;
          writeln ('Digite um Numero Inteiro que Esteja ou Nao na Sequencia Digitada');
  read (y);
  //
  //Comparaçao da variavel com o vetor
  //
  for i:=1 to 20 do
  begin
       //
       if (y=vet[i]) then
       begin
            aux:=1;
            posicao:=i;
       end;
  end;
  //
  //Imprimindo Resultado
  //
  if (aux=0) then
  begin
       writeln(' Numero nao Encontrado ');
  //
  end else
      writeln (' Numero Encontrado - Posicao - ',posicao);
  readkey;
end.
//Desenvolvido Por EZS
