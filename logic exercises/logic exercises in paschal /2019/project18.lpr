program project18;
uses crt;
var
n1,n2,n3:integer;
begin
  clrscr;
         writeln('digite seu primeiro valor:');
         read(n1);
         writeln('digite seu segundo valor:');
         read(n2);
         writeln('digite seu terceiro valor:');
         read(n3);

         if ((n1>n2) or (n1>n3)) then
         begin
           writeln('Esse e o maior valor:',n1);
         end;
         if ((n2>n1) or (n2>n3)) then
         begin
           writeln('Esse e o maior valor:',n2);
         end;
         if ((n3>n1) or (n3>n2)) then
         begin
           writeln('Esse e o maior valor:',n3);
         end;

         if (n1=n2) and (n1=n3) and (n2=n3) then
         begin
           writeln('ERRO!');
         end;
  readkey;
end.

