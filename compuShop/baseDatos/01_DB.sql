CREATE TABLE computadores(
cod_computador serial not null,
marca_computador varchar(200) not null,
procesador_computador varchar(200) not null,
precio_computador decimal(10,2) not null,
capacidad_computador decimal(10,2) not null,
primary key (cod_computador)
);
ALTER TABLE computadores owner to user_java;	


