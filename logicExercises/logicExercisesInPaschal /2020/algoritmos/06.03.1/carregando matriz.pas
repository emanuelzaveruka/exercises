Program carregandomatrizes;
var

  matriz:array[1..3,1..3] of integer;
  
  procedure ltecla();
  var
	tecla:integer;
  begin
  	tecla:=readkey;
  	if (tecla=48) then
  	begin
  		writeln('teste');
  	end;
  end;
	  
	procedure cmatriz();
	var
	i, j:integer;
	Begin
		for i:=1 to 3 do
		begin 
				for j:=1 to 3 do
				begin
					matriz[i,j]:=1
				end;
		end;
	End;

	procedure imatriz();
	var
	i,j:integer;
	begin
		for i:=1 to 3 do
				begin 
				for j:=1 to 3 do
				begin
				  write (matriz[i,j]);
				  write (' ');
				end;
				writeln (' ');
		end;
	End;
	
	
begin
	cmatriz;
	 imatriz;
	 	ltecla;
end.