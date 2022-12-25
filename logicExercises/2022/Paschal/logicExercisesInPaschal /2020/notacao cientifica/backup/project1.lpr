//fp que leia um vetor de 10 posições com numeros//
program project1;
  uses crt;
  var
    x, x2:real;
    cont, aux, ao:integer;
begin
     cont:=0;
     aux:=0;
     writeln ('digite um valor que voce deseja ');
     read (x);

     x2:=x/1000;

    { while (x>1) do
     begin
          x:=x*10;
          cont:=cont+1;
          aux:=1;
     end;

     while (x<=10) do
     begin
       x:=x/10;
       cont:=cont+1;
       ao:=2;
     end;

     if (ao=2) then
     begin
          writeln(x,'*10^',cont);
     end;

     if (aux=1) then
     begin
          writeln(x,'*10^-',cont);
     end;}
        //converte numeros que o usuario digita com 3 zeros na fre

        writeln (x2);

readkey;
end.
