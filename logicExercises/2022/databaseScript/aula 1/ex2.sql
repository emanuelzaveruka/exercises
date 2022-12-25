create database tb_teste;
use tb_teste;
create table aluno(
	matricula int primary key auto_increment,
    nome varchar(100) not null,
    data_nasc date not null,
    CPF bigint not null,
    idade bigint not null
);
create table curso (
	cod int primary key auto_increment,
	nome varchar(100) not null,
	carga_h int
);
create table aluno_curso(
	mat_aluno_fk int not null,
	cod_curso_fk int not null,
    ano int not null,
    semestre smallint not null,
    primary key(mat_aluno_fk, cod_curso_fk, ano, semestre)
);

insert into aluno(nome, data_nasc, CPF) values
("Arthur", "2006-09-01", 1234567);

insert into aluno(nome, data_nasc, CPF) values
("Ana", "2004-02-07", 3434367),
("Joao", "2001-08-03", 9090367),
("Maria", "2008-10-03", 9232367);

Update aluno set nome = "Artur" where matricula = 1;
/* EXCLUIR DADOS DA TABELA */

delete from aluno where matricula = 5;

/* SELEÇÃO NA TABELA DO BD*/
select nome from aluno;