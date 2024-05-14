CREATE TABLE productos(
cod_producto serial not null,
nombre_producto varchar(200) not null,
cantidad_producto int4 not null,
precio_producto decimal(10,2) not null,
primary key (cod_producto)
	
);
ALTER TABLE productos owner to user_java;	
