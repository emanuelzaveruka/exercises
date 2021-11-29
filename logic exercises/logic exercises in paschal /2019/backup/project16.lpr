program project16;
        uses crt;
        var
          a,b,c,d,total,base,expoente,a2,b2,c2,a3,b3,cauculo:integer;
          n,e,result:real;
begin
  clrscr;
         writeln('Digite o valor de A: ');
         read(a);
         writeln('Digite o valor de B: ');
         read(b);
         writeln('Digite o valor de C: ');
         read(c);
         writeln('Esse e o resultado: ',(a+b)*c);

         writeln(' ');

         writeln('Digite o valor total: ');
         read(total);
         writeln('Digite o valor de N: ');
         read(n);
         writeln('Esse e o resultado: ',total/n);

         writeln(' ');

         writeln('Digite o valor de A: ');
         read(a2);
         writeln('Digite o valor de B: ');
         read(b2);
         writeln('Digite o valor de C: ');
         read(c2);
         writeln('Digite o valor de C: ');
         read(d);
         writeln('Digite o valor de E: ');
         read(e);
         result:=(c2+sqr(d))/e;
         result:=a-b+result;
         writeln('Esse e o resultado: ',result);

         writeln(' ');

         writeln('Digite o valor de base :');
         read(base);
         writeln('Digite o valor do expoente :');
         read(base);
  readkey;
end.

