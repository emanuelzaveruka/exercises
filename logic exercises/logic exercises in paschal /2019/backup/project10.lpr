program project10;
        uses crt;
        var
          base, altura, area:integer;
begin
clrscr;
       write('Digite o valor de base: ');
       read(base);
       write('Digite o valor de altura: ');
       read(altura);
       area:=(base*altura)/2;
       write('Esse e o valor do triangulo: ',area);
readkey;
end.

