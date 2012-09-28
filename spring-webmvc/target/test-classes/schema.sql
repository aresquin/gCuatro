drop table if exists usuarios;
drop table if exists Subcategoria;
drop table if exists Archivo_Adjunto;
drop table if exists Comentario;
drop table if exists Detalle_Compra;
drop table if exists Plan_Negocio;
drop table if exists Categoria;
drop table if exists Compra;
drop table if exists Usuario;
drop table if exists Perfil;
drop table if exists Estado;
drop table if exists Tipo_Documento;

CREATE  TABLE usuarios (
  id INT NOT NULL AUTO_INCREMENT ,
  nombre VARCHAR(45) NULL ,
  correo VARCHAR(45) NULL ,
  password VARCHAR(45) NULL ,
  PRIMARY KEY (id) );

CREATE  TABLE Estado (
  nEstID INT NOT NULL AUTO_INCREMENT ,
  cEstNombre VARCHAR(30) NOT NULL ,
  cEstFecCrea DATE NULL ,
  nUsuCrea INT NULL ,
  cEstFecModi DATE NULL ,
  nUsuModi INT NULL ,
  PRIMARY KEY (nEstID) );

CREATE  TABLE Categoria (
  nCatID INT NOT NULL AUTO_INCREMENT ,
  cCatNombre VARCHAR(30) NOT NULL ,
  nEstID INT NULL ,
  sCatRutaImagen VARCHAR(100) NULL ,
  cCatFecCrea DATE NULL ,
  nUsuCrea INT NULL ,
  cCatFecModi DATE NULL ,
  nUsuModi INT NULL ,
  PRIMARY KEY (nCatID) );

CREATE  TABLE Subcategoria (
  nSCatID INT NOT NULL AUTO_INCREMENT ,
  cSCatNombre VARCHAR(50) NOT NULL ,
  nCatID INT NOT NULL ,
  cSCatFecCrea DATE NULL ,
  nUsuCrea INT NULL ,
  cSCatFecModi DATE NULL ,
  nUsuModi INT NULL ,
  PRIMARY KEY (nSCatID) );

CREATE  TABLE Perfil (
  nPerID INT NOT NULL AUTO_INCREMENT ,
  cPerNombre VARCHAR(50) NOT NULL ,
  cPerFecCrea DATE NULL ,
  us_creacion INT NULL ,
  cPerFecModi DATE NULL ,
  nUsuModi INT NULL ,
  PRIMARY KEY (nPerID) );

CREATE  TABLE Tipo_Documento (
  nTDocID INT NOT NULL AUTO_INCREMENT ,
  cTDocNombre VARCHAR(25) NOT NULL ,
  cTDocFecCrea DATE NULL ,
  nUsuCrea INT NULL ,
  cTDocFecModi DATE NULL ,
  nUsuModi INT NULL ,
  PRIMARY KEY (nTDocID) );

CREATE  TABLE Usuario (
  nUsuID INT NOT NULL AUTO_INCREMENT ,
  cUsuNombre VARCHAR(25) NOT NULL ,
  cUsuApePat VARCHAR(30) NOT NULL ,
  cUsuApeMat VARCHAR(30) NOT NULL ,
  cUsuSexi VARCHAR(2) NOT NULL ,
  nTDocID INT NOT NULL ,
  cUsuNumDocumento VARCHAR(30) NOT NULL ,
  cUsuEmail VARCHAR(30) NOT NULL ,
  cUsuTelefono VARCHAR(9) NOT NULL ,
  cUsuDireccion VARCHAR(60) NOT NULL ,
  cUsuFecNacimiento DATE NOT NULL ,
  cUsuClave VARCHAR(10) NOT NULL ,
  nPerID INT NOT NULL ,
  cUsuApelativo VARCHAR(30) NULL ,
  cUsuRegAutografico VARCHAR(500) NULL ,
  cUsuSitWeb VARCHAR(30) NULL ,
  cUsuNumCuenta VARCHAR(50) NULL ,
  nEstID INT NULL ,
  cUsuFecCrea DATE NULL ,
  nUsuCrea INT NULL ,
  cUsuFecModi DATE NULL ,
  nUsuModi INT NULL ,
  PRIMARY KEY (nUsuID) );

CREATE  TABLE Plan_Negocio (
  nPlaID INT NOT NULL AUTO_INCREMENT ,
  cPlaTitulo VARCHAR(100) NOT NULL ,
  nCatID INT NOT NULL ,
  cPlaVision VARCHAR(500) NOT NULL ,
  cPlaRazon VARCHAR(500) NOT NULL ,
  cPlaTiempo VARCHAR(30) NOT NULL ,
  nPlaInvTot DOUBLE NOT NULL ,
  nPlaNeto DOUBLE NOT NULL ,
  nPlaROI DOUBLE NOT NULL ,
  nPlaPreVenta DOUBLE NOT NULL ,
  cPlaFecValidacion DATE NULL ,
  nEstID INT NOT NULL ,
  nPlaFecCrea DATE NOT NULL ,
  nUsuCrea INT NULL ,
  cPlaFecModi DATE NULL ,
  nUsuModi INT NULL ,
  PRIMARY KEY (nPlaID) );

CREATE  TABLE Comentario (
  nComID INT NOT NULL AUTO_INCREMENT ,
  cComDescripcion VARCHAR(500) NOT NULL ,
  nPlaID INT NOT NULL ,
  nUsuID INT NOT NULL ,
  cComFecCrea DATE NOT NULL ,
  PRIMARY KEY (nComID) );

CREATE  TABLE Compra (
  nComID INT NOT NULL AUTO_INCREMENT ,
  cComNumero VARCHAR(14) NOT NULL ,
  cComFecCaducidad DATE NOT NULL ,
  co_verificacion VARCHAR(9) NOT NULL ,
  di_facturacion VARCHAR(50) NOT NULL ,
  nUsuID INT NOT NULL ,
  nEstID INT NOT NULL ,
  cComFecCrea DATE NULL ,
  nUsuCrea INT NULL ,
  cComFecModi DATE NULL ,
  nUsuModi INT NULL ,
  PRIMARY KEY (nComID) );

CREATE  TABLE Detalle_Compra (
  nComID INT NOT NULL ,
  nDComID INT NOT NULL ,
  nPlaID INT NOT NULL ,
  PRIMARY KEY (nDComID) );

CREATE  TABLE Archivo_Adjunto (
  nAAdjID INT NOT NULL AUTO_INCREMENT ,
  nPlaID INT NOT NULL ,
  nAAdjSecuencia INT NULL ,
  cAAdjNombre VARCHAR(100) NULL ,
  cAAdjExtension VARCHAR(100) NULL ,
  cAAdjFecCrea DATE NULL ,
  nUsuCrea INT NULL ,
  PRIMARY KEY (nAAdjID) );