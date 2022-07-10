program project1;
        uses crt;
        var
           nome: string;
begin
   clrscr;{Limpa tela};
                 write('Digíte seu nome:');
                 read(nome);
                 write('Esse é o seu nome',nome);
   readkey;{Leitura de tela temporária};
end.

