program project6;
        uses crt;
        var
          n1,n2 :integer; divi: real;
begin
  clrscr;
         write('Digite seu primeiro numero: ');
         read(n1);
         write('Digite seu segundo numero: ');
         read(n2);
         divi:=(n1/n2);
         write('Essa e a divisao: ',divi);
  readkey;
end.

