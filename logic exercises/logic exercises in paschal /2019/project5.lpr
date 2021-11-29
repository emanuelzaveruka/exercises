program project5;
        uses crt;
        var
          n1, n2, mult: integer;
begin
  clrscr;
         write('Digite seu primeiro numero: ');
         read(n1);
         write('Digite seu segundo numero: ');
         read(n2);
         mult:=(n1*n2);
         write('Essa e a multiplicaçao dos numeros: ',mult);
  readkey;
end.

