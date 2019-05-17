create database produtodb;
use produtodb;
create table tbproduto(
id int auto_increment primary key,
NomeDoProduto varchar(15) not null,
DescricaoDoProduto varchar(50) not null,
FabricanteDoProduto varchar(10) not null,
Quantidade varchar(4) not null,
Preco decimal(10,2)
);
insert into tbproduto(NomeDoProduto,DescricaoDoProduto,FabricanteDoProduto,Quantidade,Preco)
values('Agua','AguaNatural','MRamos',40,5.00);

select * from tbproduto; 

