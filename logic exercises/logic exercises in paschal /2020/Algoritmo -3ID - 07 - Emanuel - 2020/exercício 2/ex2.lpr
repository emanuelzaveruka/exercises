program ex2;
uses crt;
//
//variavel global
//
var
  vet:array[1..10] of integer;
  //
  //procedimento que carrega vetor com numeros
  //input
  //
  procedure cvet();
  var
  i:integer;
  begin
    for i:=1 to 10 do
    begin
    vet[i]:=(i*2)-1;
    end;
    //
    //imprimindo vet
    //
    for i:=1 to 10 do
     begin
      writeln (vet[i]);
     end;
    end;
    //
    //output
    //
begin
  clrscr;
  cvet;
  readkey;
end.
//Desenvolvido Por EZS

