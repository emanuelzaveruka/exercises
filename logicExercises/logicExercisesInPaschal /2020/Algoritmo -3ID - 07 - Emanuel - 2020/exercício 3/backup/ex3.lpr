program ex3;
uses crt;
//
//varialvel global
//
   //
   var
     Vet:array [1..16] of integer;
  //
  //procedimento que carrega vetores
  //
  procedure  cvet;
     //
     var
        i, x:integer;
  begin
       //
       for i:=1 to 16 do
       begin
            writeln ('digite valores inteiros positivos');
            read (x);
            vet[i]:=x;
       end;
  end;
  //
  //procedimento de inversão de vetor
  //
  procedure invertevalor();
  var
     //
     i, x, aux:integer;
  begin
       //
       for i:=1 to 8 do
       begin
            //
            for x:=9 to 16 do
            begin
                 aux:=vet[i];
                      vet[i]:=vet[x];
                 vet[x]:=aux;
            end;
       end;
  end;
  //
  //procedimento que imprimi vetor final
  //
  procedure imprimivet();
  var
     //
     i:integer;
  begin
       //
       for i:=1 to 16 do
       begin
            writeln (Vet[i]);
       end;
  end;
  //
  begin
     cvet;
        invertevalor;
        imprimivet;
     readkey;
  end.
//Desenvolvido Por EZS
