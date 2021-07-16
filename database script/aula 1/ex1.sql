/*SELECT com WHERE like*/
select * from aluno;
select * from aluno WHERE 
data_nasc >= "2004-01-01"
AND data_nasc <= "2010-12-31";
/*FUNÇÕES DE AGREGAÇÃO
media
minimo
maximo 
count
soma
*/

select nome, idade from aluno;
select max(data_nasc) as maior from aluno; /*maior numero*/
select min(data_nasc) as menor from aluno; /*menor numero*/
select avg(data_nasc) as media from aluno; /*media do numeros*/
select count(data_nasc) as quantidade_dt from aluno; /*quantidade de data ou ""alunos*/
select sum(data_nasc) as soma_dt from aluno; /*soma todas as datas ou idades*/