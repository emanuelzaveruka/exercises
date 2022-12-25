program project22;
uses crt;
var
  n1, n2:integer;

begin
  writeln ('escreva um numero');
  read (n1);
  writeln ('escreva outro numero');
  read (n2);
  if (n1>n2) then
  begin
  writeln ('o primeiro numero e maior que o segundo');
  end;
  if (n2>n1) then
  begin
    writeln ('o segundo numero e maior que o primeiro');
  end;


  readkey;
end.

