program ex6;
uses crt;
     var
     vet:array [1..30] of integer;
     i, x, soma:integer;

begin

  //input

  for i:=1 to 30 do
  begin
      writeln ('digite um valor');
    readln (x);
    vet[i]:=x;
  end;

  //end input

  //logic program

  for i:=1 to 30 do
  begin
       soma:=soma+vet[i];
  end;

  //end logic program

  //impress

    writeln ('');
  writeln ('o resultado da soma desses valrores e', soma);

  readkey;
end.

