program que leia o nome do time;
        uses crt;
        var
          Time:string;
begin
  clrscr;
  write('Digite o nome de um time: ');
  read(Time);
  write('Esse e o seu time: ',Time);
  readkey;
end.

