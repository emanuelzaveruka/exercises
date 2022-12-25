program ex7;
uses crt;
Var
  vet: array [1..10] of integer;
  x, y:integer;
  i:integer;

begin

  //input

  for i:=1 to 10 do
  begin
  writeln ('digite um valor');
   read (x);
  vet[i]:=x;
  end;

  //end input

  //output

  for i:=1 to 10 do
  begin
  writeln;
  writeln(vet[i]);
  end;

  //end output

  //input
  writeln;
  writeln ('digite um numero inteiro que esteja ou nao na sequencia digitada');
   read (y);

  //end input

  //
  //logic program
  //

  //output

  for i:=1 to 10 do
  begin
       if (y=vet[i]) then
       begin
            writeln ('o numero encotrasse nos numeros digitados');
                break;
       end;

       if (y<>vet[i]) then
       begin
            writeln ('o numero nao encotrasse nos numeros digitados');
            break;
       end;
  end;

  //end output

  readkey;

end.

