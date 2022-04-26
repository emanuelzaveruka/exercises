program project7;
        uses crt;
        var
          n1,n2,sub :integer;
begin
  clrscr;
         write('Digite seu primeiro numero: ');
         read(n1);
         write('Digite seu segundo numero: ');
         read(n2);
         sub:=(n1-n2);
         write('Essa e a divisao: ',sub);
  readkey;
end.

