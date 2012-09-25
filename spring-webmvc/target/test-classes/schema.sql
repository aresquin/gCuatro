drop table if exists usuarios;
drop table if exists subcategorias;
drop table if exists Archivo_Adjunto;
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
  id IDENTITY ,
  nombre VARCHAR(45) ,
  correo VARCHAR(45) ,
  password VARCHAR(45) );

CREATE  TABLE estados (
  id_estado IDENTITY,
  ti_estado VARCHAR(30) ,
  de_tabla VARCHAR(15) ,
  fe_creacion DATE ,
  us_creacion VARCHAR(30) ,
  fe_modificacion DATE ,
  us_modificacion VARCHAR(30) );

CREATE  TABLE categorias (
  id_categoria IDENTITY ,
  no_categoria VARCHAR(15) ,
  ru_imagen VARCHAR(50) ,
  st_categoria INT ,
  fe_creacion VARCHAR(20) ,
  us_creacion VARCHAR(30) ,
  fe_modificacion VARCHAR(20) ,
  us_modificacion VARCHAR(30) );

CREATE  TABLE subcategorias (
  id_subcategoria IDENTITY ,
  no_subcategoria VARCHAR(15) ,
  id_categoria INT ,
  fe_creacion DATE ,
  us_creacion VARCHAR(30) ,
  fe_modificacion DATE ,
  us_modificacion VARCHAR(30) );

CREATE  TABLE tipo_usuario (
  id_ti_usuario IDENTITY ,
  no_ti_usuario VARCHAR(15) ,
  fe_creacion DATE ,
  us_creacion VARCHAR(30) ,
  fe_modificacion DATE ,
  us_modificacion VARCHAR(30) );

CREATE  TABLE tipo_documento (
  id_documento IDENTITY ,
  ti_documento VARCHAR(25) ,
  fe_creacion DATE ,
  us_creacion VARCHAR(30) ,
  fe_modificacion DATE ,
  us_modificacion VARCHAR(30) );

CREATE  TABLE usuarios1 (
  id_usuario IDENTITY ,
  no_usuario VARCHAR(25) ,
  ap_paterno VARCHAR(15) ,
  ap_materno VARCHAR(15) ,
  us_sexo BOOLEAN ,
  id_documento INT ,
  nu_documento VARCHAR(15) ,
  us_email VARCHAR(30) ,
  us_telefono VARCHAR(9) ,
  us_direccion VARCHAR(60) ,
  fe_nacimiento DATE ,
  us_clave VARCHAR(10) ,
  id_ti_usuario INT ,
  sa_apelativo VARCHAR(30) ,
  re_autobiografico VARCHAR(500) ,
  si_web VARCHAR(30) ,
  nu_cuenta INT ,
  st_usuario INT ,
  fe_creacion DATE ,
  us_creacion VARCHAR(30) ,
  fe_modificacion DATE ,
  us_modificacion VARCHAR(30) );


CREATE  TABLE Plan_Negocio (
  nPlaID INT NOT NULL 
  cPlaTitulo VARCHAR(100) NULL ,
  nCatID INT NULL ,
  cPlaVision VARCHAR(500) NULL ,
  cPlaRazon VARCHAR(500) NULL ,
  cPlaTiempo VARCHAR(30) NULL ,
  nPlaTotal DOUBLE NULL ,
  nPlaNeto DOUBLE NULL ,
  nPlaROI DOUBLE NULL ,
  nPlaMargen DOUBLE NULL ,
  nPlaPreVenta DOUBLE NULL ,
  nEstID INT NULL ,
  nPlaFecCrea DATETIME NULL ,
  nUsuCrea INT NULL ,
  cPlaFecModi DATETIME NULL ,
  nUsuModi INT NULL ,
  PRIMARY KEY (nPlaID));

CREATE  TABLE Archivo_Adjunto (
  nAAdjID INT NOT NULL AUTO_INCREMENT,
  nPlaID INT NULL ,
  nAAdjSecuencia INT NULL ,
  cAAdjNombre VARCHAR(100) NULL ,
  cAAdjExtension VARCHAR(100) NULL ,
  cAAdjFecCrea DATETIME NULL ,
  nUsuCrea INT NULL ,
  PRIMARY KEY (nAAdjID) );


CREATE  TABLE comentarios (
  id_comentario IDENTITY ,
  de_comentario VARCHAR(500) ,
  id_pl_negocio INT ,
  id_usuario INT ,
  fe_registro DATE );

CREATE  TABLE compras (
  id_compra IDENTITY ,
  nu_tarjeta VARCHAR(14) ,
  fe_caducidad DATE ,
  co_verificacion VARCHAR(9) ,
  di_facturacion VARCHAR (50) ,
  id_usuario INT ,
  st_compra INT ,
  fe_creacion DATE ,
  us_creacion VARCHAR(30) ,
  fe_modificacion DATE ,
  us_modificacion VARCHAR(30) );

CREATE  TABLE detalle_compras (
  id_det_compra IDENTITY ,
  id_compra INT ,
  id_pl_negocio INT );