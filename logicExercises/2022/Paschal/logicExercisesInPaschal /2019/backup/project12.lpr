program project12;
        uses crt;
        var
          HT,VH,PD,SB,TD,SL:real;
begin
  clrscr;
         write('Digite as horas trabalhadas no mes: ');
         read(HT);
         write('Digite o valor da hora trabalhada: ');
         read(VH);
         write('Digite o percentual de desconto: ');
         read(PD);

         write('Esse e o seu salario bruto: ',HT*VH);
         read(SB);
         write('Esse e o seu total de desconto: ',(PD/100)*SB);
         read(TD);
         write('Esse e o seu salario liquido: ',SB-TD);
         read(SL);
  readkey;
end.

