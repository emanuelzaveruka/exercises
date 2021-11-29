program ex4;
clt uses;
    var
      n:integer;

begin

  //ENTRADA DE VALORES

  writeln ('digte o valor');
          read (n);

  //LÓGICA DO EXERCICIO

  if (n<=10) then
     begin
      writeln ('F1');
    end;

        if (n>10) and (n<=100) then
        begin
             writeln ('F2');
        end;

            if (n>10) then
            begin
                 writeln ('F3');
            end;



  readkey;
end.

