program ex5;
Uses crt;
  //
  var
    //
    //Variaveis Globais
    //
    i, x,aux:integer;
    vet:array [1..40] of integer;
begin
  //
  // Carregando vetor
  //
  for i:=1 to 40 do
  begin
    writeln ('Digite valores Inteiros Positivos Maiores que Zero');
            read(x);
    vet[i]:=x;
  end;
  //
  //Comparando valores do vetor
  //
  for i:=1 to 40 do
  begin
    //
    if (vet[i] mod 2 = 0) then
    begin
      aux:=aux+1;
    end;
  end;
  //
  //Imprimindo Quantidade de Numeros Pares tem
  //
  writeln ('A quantidade de números pares sao:  ',aux);
  readkey;
end.
//Desenvolvido Por EZS
