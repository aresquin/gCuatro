drop table if exists usuarios;
drop table if exists subcategorias;
drop table if exists detalle_plnegocio;
drop table if exists comentarios;
drop table if exists detalle_compras;
drop table if exists compras;
drop table if exists plan_negocio;
drop table if exists categorias;
drop table if exists usuarios1;
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
  id_categoria INT NOT NULL AUTO_INCREMENT,
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

CREATE  TABLE usuarios1 (
  id_usuario INT NOT NULL AUTO_INCREMENT,
  no_usuario VARCHAR(25) NOT NULL ,
  ap_paterno VARCHAR(15) NOT NULL ,
  ap_materno VARCHAR(15) NOT NULL ,
  us_sexo BOOLEAN NOT NULL ,
  id_documento INT NOT NULL ,
  nu_documento VARCHAR(15) NOT NULL ,
  us_email VARCHAR(30) NOT NULL ,
  us_telefono VARCHAR(9) NOT NULL ,
  us_direccion VARCHAR(60) NOT NULL ,
  fe_nacimiento DATE NOT NULL ,
  us_clave VARCHAR(10) NOT NULL ,
  id_ti_usuario INT NOT NULL ,
  sa_apelativo VARCHAR(30) NULL ,
  re_autobiografico VARCHAR(500) NULL ,
  si_web VARCHAR(30) NULL ,
  nu_cuenta INT NULL ,
  st_usuario INT NOT NULL ,
  fe_creacion DATE NULL ,
  us_creacion VARCHAR(30) NULL ,
  fe_modificacion DATE NULL ,
  us_modificacion VARCHAR(30) NULL ,
  PRIMARY KEY (id_usuario) ,
  FOREIGN KEY (id_documento)
  REFERENCES tipo_documento (id_documento) ,
  FOREIGN KEY (id_ti_usuario) 
  REFERENCES tipo_usuario (id_ti_usuario) ,
  FOREIGN KEY (st_usuario) 
  REFERENCES estados (id_estado) );

CREATE  TABLE plan_negocio (
  id_pl_negocio INT NOT NULL AUTO_INCREMENT,
  ti_pl_negocio VARCHAR(30) NOT NULL ,
  id_categoria VARCHAR(6) NOT NULL ,
  vi_negocio VARCHAR(500) NOT NULL ,
  ra_propuesta VARCHAR(500) NOT NULL ,
  ti_ejecucion VARCHAR(30) NOT NULL ,
  in_total DOUBLE NOT NULL ,
  ma_neto DOUBLE NOT NULL ,
  pl_roi DOUBLE NOT NULL ,
  pr_venta DOUBLE NOT NULL ,
  st_pl_negocio INT NOT NULL ,
  id_usuario INT NOT NULL ,
  co_pl_negocio VARCHAR(500) NULL ,
  fe_validacion DATE NULL ,
  fe_creacion DATE NULL ,
  us_creacion VARCHAR(30) NULL ,
  fe_modificacion DATE NULL ,
  us_modificacion VARCHAR(30) NULL ,
  PRIMARY KEY (id_pl_negocio) ,
  FOREIGN KEY (id_categoria)
  REFERENCES categorias (id_categoria) ,
  FOREIGN KEY (st_pl_negocio) 
  REFERENCES estados (id_estado) ,
  FOREIGN KEY (id_usuario) 
  REFERENCES usuarios1 (id_usuario) );

CREATE  TABLE detalle_plnegocio (
  id_det_plnegocio INT NOT NULL AUTO_INCREMENT,
  id_pl_negocio INT NOT NULL ,
  do_pl_negocio BLOB NOT NULL ,
  PRIMARY KEY (id_det_plnegocio) ,
  FOREIGN KEY (id_pl_negocio)
  REFERENCES plan_negocio (id_pl_negocio) );
  
CREATE  TABLE comentarios (
  id_comentario INT NOT NULL AUTO_INCREMENT,
  de_comentario VARCHAR(500) NOT NULL ,
  id_pl_negocio INT NOT NULL ,
  id_usuario INT NOT NULL ,
  fe_registro DATE NOT NULL ,
  PRIMARY KEY (id_comentario) ,
  FOREIGN KEY (id_pl_negocio)
  REFERENCES plan_negocio (id_pl_negocio) ,
  FOREIGN KEY (id_usuario)
  REFERENCES usuarios1 (id_usuario) );

CREATE  TABLE compras (
  id_compra INT NOT NULL AUTO_INCREMENT,
  nu_tarjeta VARCHAR(14) NOT NULL ,
  fe_caducidad DATE NOT NULL ,
  co_verificacion VARCHAR(9) NOT NULL ,
  di_facturacion VARCHAR (50) NOT NULL ,
  id_usuario INT NOT NULL ,
  st_compra INT NOT NULL ,
  fe_creacion DATE NULL ,
  us_creacion VARCHAR(30) NULL ,
  fe_modificacion DATE NULL ,
  us_modificacion VARCHAR(30) NULL ,
  PRIMARY KEY (id_compra) ,
  FOREIGN KEY (st_compra)
  REFERENCES estados (id_estado) ,
  FOREIGN KEY (id_usuario)
  REFERENCES usuarios1 (id_usuario) );

CREATE  TABLE detalle_compras (
  id_det_compra INT NOT NULL ,
  id_compra INT NOT NULL ,
  id_pl_negocio INT NOT NULL ,
  PRIMARY KEY (id_det_compra) ,
  FOREIGN KEY (id_compra)
  REFERENCES compras (id_compra) ,
  FOREIGN KEY (id_pl_negocio)
  REFERENCES plan_negocio (id_pl_negocio) );