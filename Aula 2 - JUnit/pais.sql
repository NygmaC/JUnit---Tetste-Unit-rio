drop database aula2;
create database aula2;
use aula2;
SET GLOBAL time_zone = '+4:00';

CREATE TABLE Pais(
id int unsigned not null auto_increment,
nome varchar(100),
populacao bigint,
area decimal (15.2),
constraint pk_pais primary key (id)
);

insert into pais(nome, populacao, area) values ('Afeganistão', 31108077, 652090);
insert into pais(nome, populacao, area) values ('Bélgica', 11420163, 30528);
insert into pais(nome, populacao, area) values ('Brasil', 208494900, 8515767);
insert into pais(nome, populacao, area) values ('Bielorrússia', 9491800, 207600);
insert into pais(nome, populacao, area) values ('Canadá', 37242571, 9984670);
insert into pais(nome, populacao, area) values ('Chile', 18050000, 756950);
insert into pais(nome, populacao, area) values ('Croácia', 4190669, 56542);
insert into pais(nome, populacao, area) values ('Espanha', 46524943, 504030);
insert into pais(nome, populacao, area) values ('Geórgia', 3718200, 69700);
insert into pais(nome, populacao, area) values ('Indonésia', 260580739, 1904569);

select * from pais;
-- select id, nome, populacao, area from pais order by populacao desc limit 1; -- maior população
-- select id, nome, populacao, area from pais order by area asc limit 1; -- menor area

