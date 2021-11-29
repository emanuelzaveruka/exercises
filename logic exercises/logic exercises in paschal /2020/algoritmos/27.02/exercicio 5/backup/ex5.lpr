program ex5;
uses crt;
     var
       A, B, C, soma:real;

begin

  //Input

    writeln ('digite o primeiro valor');
  read (A);

    writeln ('digite o segundo valor');
  read (B);

    writeln ('digite o terceiro valor');
  read (C);

  //input end

  //logic program

  soma:=A+B;

  if (soma<c) then
  begin
    writeln ('a soma dos dois primeiro valores e menor que o terceiro');
  end;

  if (soma>=c) then
  begin
    writeln ('a soma dos dois primeiro valores e maior ou igual ao terceior');
  end;

  readkey;
end.

