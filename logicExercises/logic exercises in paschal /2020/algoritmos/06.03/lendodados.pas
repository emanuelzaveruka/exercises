Program lendodados;
var
	nome:string; 
	//
 	//UM PROCEDIMENTO PARA PROGRAMÇÃO 
 	//EM BLOCOS 
 	//
	 
	//
 	//ESSE PROCEDIMENTO LE O NOME
	//
	procedure lnome();	
	Begin 
  	read (nome);
	End;
	
	//
	//ESSE PROCEDIMENTO IMPRIME O NOME
	//
	procedure inome();
	begin 
		writeln(nome);
	end;
	
	begin
			writeln('digite o nome');
				    lnome; //AQUI SERA O READ
	    inome;     //AQUI SERIA O WRITELN IMPRIMINDO A VARIAVEL LIDA
	end.