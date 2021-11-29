program project9;
        uses crt;
        var
           n1,n2,n3,result1,result2:integer;
begin
  clrscr;
         n1:=5;
         n2:=3;
         n3:=7;
         result1:=(n1*n1);
         result2:=(n3*n3);
         result2:=(result1+result2);
         result2:=(result2-n2);
         write('O resultado e:',result2);
  readkey;
end.
