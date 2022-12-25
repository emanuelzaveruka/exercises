program project17;
uses crt;
var
  nome:string;
begin
  clrscr;
         writeln ('Digite um nome:');
         read (nome);

         if ((nome='MARIA') or (nome='maria') or (nome='Maria'))then
         begin
           writeln('FEMININO');
         end;

         if ((nome='JOÃO') or (nome='joão') or (nome='João')) then
         begin
           writeln('MASCULINO');
         end;


         if (nome<>'MARIA') and (nome<>'maria') and (nome<>'Maria') and (nome<>'JOÃO') and (nome<>'joão') and (nome<>'João') then
         begin
           writeln('ERRO');
         end;
  readkey;
end.

