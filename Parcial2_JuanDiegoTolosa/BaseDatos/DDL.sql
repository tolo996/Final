create table editoriales(

cod_editorial serial not null,
nombre_editorial varchar(250) not null,
direccion_editorial  varchar(500) not null,
genero_editorial varchar(250) not null,
constraint pk_editoriales primary key (cod_editorial)
);

alter table editoriales owner to user_java
;

create table libros(
cod_libro serial not null,
cod_editorial int4 not null,
nombre_libro varchar(250) not null,
autor_libro varchar(500) not null,
valor_libro decimal(10,2) not null,
constraint pk_libros primary key (cod_libro)

);

alter table libros owner to user_java
;


alter table libros
 add constraint fk_libros_ref_editorial foreign key (cod_editorial)
  references editoriales (cod_editorial)
  on delete restrict on update cascade;