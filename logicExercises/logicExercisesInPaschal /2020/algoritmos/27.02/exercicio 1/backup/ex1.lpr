program ex1;
uses crt;
var
  n1,n2,media:real;

begin

  //lendo valores

  writeln('digite um numero');
   read (n1);

         writeln('digite outro numero');
           read (n2);

  //lógica

  media:=(n1+n2)/2;

  //imprimindo resultado

  writeln(media);
readkey;
end.

