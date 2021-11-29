//exercicio numero 1
program project1;
uses crt;
//
//variaveis locais
//
var
   vet:array[1..12] of integer;
       pos1, pos2, i, x,soma, num1, num2:integer;
begin
clrscr;
//
//Carregando vetor
//
      for i:=1 to 12 do
      begin
           writeln('digite um valor inteiro positivo');
              read (x);
           vet[i]:=x;
      end;
      //
      //lendo posicoes requisitadas pelo usuario
      //
      writeln ('digite a posicao entre os numeros 1 a 16');
        readln (pos1);
      writeln ('digite a segunda posicao entre os numeros 1 a 16');
        readln (pos2);
      //
      {lendo, comparando as posicoes com o vetor e
      armazenando os numeros para a soma}
      //
      for i:=1 to 12 do
      begin
        //
        if (pos1=i) then
        begin
             num1:=vet[i];
        end;
        //
        if (pos2=i) then
        begin
             num2:=vet[i];
        end;
        //
      end;
      //
      //Mostrando numeros que o usuario requisitou
      //
      writeln;
         writeln ('Os Numeros da posicao que voce requsitou sao:  ',num1,' e ',num2);
      writeln;
      //
      //Soma dos Numeros requisitados
      //
      soma:=num1+num2;
      //
      //Imprimindo Resultado
      //
      writeln ('A soma dos numeros das posicoes digitadas e :',soma);
readkey;
end.
//Desenvolvido por EZS
