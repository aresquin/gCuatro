drop table if exists usuarios;
drop table if exists subcategorias;
drop table if exists categorias;
drop table if exists tipo_usuario;
drop table if exists tipo_documento;
drop table if exists estados;

CREATE  TABLE usuarios (
  id INT NOT NULL AUTO_INCREMENT ,
  nombre VARCHAR(45) NULL ,
  correo VARCHAR(45) NULL ,
  password VARCHAR(45) NULL ,
  PRIMARY KEY (id) );

CREATE  TABLE estados (
  id_estado INT NOT NULL AUTO_INCREMENT,
  ti_estado VARCHAR(30) NOT NULL ,
  de_tabla VARCHAR(15) NOT NULL ,
  fe_creacion DATE NULL ,
  us_creacion VARCHAR(30) NULL ,
  fe_modificacion DATE NULL ,
  us_modificacion VARCHAR(30) NULL ,
  PRIMARY KEY (id_estado) );

CREATE  TABLE categorias (
  id_categoria VARCHAR(6) NOT NULL ,
  no_categoria VARCHAR(15) NOT NULL ,
  ru_imagen VARCHAR(50) NULL ,
  st_categoria INT NOT NULL ,
  fe_creacion DATE NULL ,
  us_creacion VARCHAR(30) NULL ,
  fe_modificacion DATE NULL ,
  us_modificacion VARCHAR(30) NULL ,
  PRIMARY KEY (id_categoria) ,
  FOREIGN KEY (st_categoria)
  REFERENCES estados (id_estado) );

CREATE  TABLE subcategorias (
  id_subcategoria INT NOT NULL AUTO_INCREMENT,
  no_subcategoria VARCHAR(15) NOT NULL ,
  id_categoria VARCHAR(6) NOT NULL ,
  fe_creacion DATE NULL ,
  us_creacion VARCHAR(30) NULL ,
  fe_modificacion DATE NULL ,
  us_modificacion VARCHAR(30) NULL ,
  PRIMARY KEY (id_subcategoria),
  FOREIGN KEY (id_categoria)
  REFERENCES categorias (id_categoria) );

CREATE  TABLE tipo_usuario (
  id_ti_usuario INT NOT NULL AUTO_INCREMENT,
  no_ti_usuario VARCHAR(15) NOT NULL ,
  fe_creacion DATE NULL ,
  us_creacion VARCHAR(30) NULL ,
  fe_modificacion DATE NULL ,
  us_modificacion VARCHAR(30) NULL ,
  PRIMARY KEY (id_ti_usuario) );

CREATE  TABLE tipo_documento (
  id_documento INT NOT NULL AUTO_INCREMENT,
  ti_documento VARCHAR(25) NOT NULL ,
  fe_creacion DATE NULL ,
  us_creacion VARCHAR(30) NULL ,
  fe_modificacion DATE NULL ,
  us_modificacion VARCHAR(30) NULL ,
  PRIMARY KEY (id_documento) );

