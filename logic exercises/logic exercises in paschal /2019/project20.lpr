program project20;
uses crt;
var
 n1,n2:integer;
begin
clrscr;
writeln('digite o primeiro valor');
read(n1);
writeln('digite o segundo valor');
read(n2);

if (n1>n2) then
begin
writeln('Essa e a ordem crescente: ',n2,',',n1);
end;

if (n2>n1) then
begin
writeln('Essa e a ordem crescente: ',n1,',',n2);
end;

readkey;
end.

