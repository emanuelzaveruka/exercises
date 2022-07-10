program project1;
        uses crt;
        var
          area, raio,pi: real;
begin
  clrscr;
         write('Digite o valor de raio: ');
         read(raio);
         raio:=raio*raio;
         pi:=3.14159;
         area:=pi*raio;
         write('Esse e o valor da sua circuferencia: ',area);
  readkey;
end.

