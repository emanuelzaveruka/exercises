Program lendodados;
var
	nome:string;
	vetor:array[1..10] of string;
	//
 	//UM PROCEDIMENTO PARA PROGRAMÇÃO 
 	//EM BLOCOS 
 	//
	 
	//
 	//ESSE PROCEDIMENTO LE O NOME
	//
	procedure lnome();
	var
	i2:integer;	
	Begin 
		  for i2:=1 to 10 do
		  begin
  		read (nome);
  		end;
	End;
	
	//
	//ESSE PROCEDIMENTO IMPRIME O NOME
	//
	
	procedure inome();
	var
	i2:integer;
	begin
	  for i2:=1 to 10 do
	  begin
		writeln(nome);
		end;
	end;
	
	begin
		lnome;
	  inome;
	  
	end.