program project6;
        uses crt;
        var
          n1,n2 :integer; resultado: real;
begin
  clrscr;
  write('Digite seu primeiro numero: ');
  read(n1);
  write('Digite seu segundo numero: ');
  read(n2);
  resultado:=(n1/n2);
  write('Essa e a divisao: ',resultado);
  readkey;
end.

