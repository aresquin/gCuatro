drop table usuarios if exists;
CREATE TABLE usuarios
(
	id identity,
	nombre VARCHAR(45),
	correo VARCHAR(45),
	password VARCHAR(45)
);

drop table avisos if exists;
CREATE TABLE avisos
(
	id identity,
	titulo VARCHAR(45),
	descripcion VARCHAR(45)
);