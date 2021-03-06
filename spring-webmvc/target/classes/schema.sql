drop table if exists usuarios;
drop table if exists Subcategoria;
drop table if exists Archivo_Adjunto;
drop table if exists Comentario;
drop table if exists Detalle_Compra;
drop table if exists PlanNegocio;
drop table if exists Compra;
drop table if exists Usuario;
drop table if exists Categoria;
drop table if exists Perfil;
drop table if exists Estado;
drop table if exists Tipo_Documento;
drop table if exists colaboradores;
drop table if exists TEnvio;
drop table if exists Pasarela;
drop table if exists colaboradores;


CREATE  TABLE Colaboradores (
 nColId INT NOT NULL AUTO_INCREMENT ,
 cColNombre VARCHAR(45) not NULL ,
 cColApePaterno VARCHAR(45) not NULL ,
 cColApeMaterno VARCHAR(45) not NULL ,
 cColCorreo varchar(45) not null,
 cColPassword varchar(8) not null ,
 nColUsuModificador int not null,
 PRIMARY KEY (nColId) );


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
  PRIMARY KEY (nCatID));

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
  cUsuNombre VARCHAR(25) NULL ,
  cUsuApePat VARCHAR(30) NULL ,
  cUsuApeMat VARCHAR(30) NULL ,
  cUsuSexo VARCHAR(2) NULL ,
  nTDocID INT NULL ,
  cUsuNumDocumento VARCHAR(30) NULL ,
  cUsuEmail VARCHAR(30) NULL ,
  cUsuTelefono VARCHAR(9) NULL ,
  cUsuDireccion VARCHAR(60) NULL ,
  cUsuFecNacimiento DATE NULL ,
  cUsuClave VARCHAR(10) NULL ,
  nPerID INT NULL ,
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

CREATE  TABLE PlanNegocio (
  nPlaID INT NOT NULL AUTO_INCREMENT,
  cPlaTitulo VARCHAR(4000) NULL ,
  nCatID INT NULL ,
  cPlaVision VARCHAR(4000) NULL ,
  cPlaRazon VARCHAR(4000) NULL ,
  cPlaTiempo VARCHAR(30) NULL ,
  nPlaInvTotal DOUBLE NULL ,
  nPlaNeto DOUBLE NULL ,
  nPlaROI DOUBLE NULL ,
  nPlaMargen DOUBLE NULL ,
  nPlaPreVenta DOUBLE NULL ,
  cPlaFecVal DATETIME NULL, 
  nEstID INT NULL ,
  cPlaFecCrea DATETIME NULL ,
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


CREATE  TABLE Comentario (
  nComID INT NOT NULL AUTO_INCREMENT ,
  cComDescripcion VARCHAR(500) NOT NULL ,
  nPlaID INT NOT NULL ,
  nUsuID INT NOT NULL ,
  cComFecCrea DATE NOT NULL ,
  PRIMARY KEY (nComID)  );


CREATE  TABLE Compra (
  nComID INT NOT NULL AUTO_INCREMENT ,
  cComNumero VARCHAR(14) NOT NULL ,
  cComFecCrea DATE NULL ,
  cComFecModi DATE NULL ,
  dComSubTotal double ,
  dComIgv double ,
  dComTotal double ,
  nUsuModi INT NULL ,
  nEstID INT NOT NULL ,
  nEnvID INT NOT NULL ,
  nUsuID INT NOT NULL ,     
  PRIMARY KEY (nComID) );

CREATE  TABLE Detalle_Compra (
  nComID INT NOT NULL , 
  nDComID INT NOT NULL ,
  nPlaID INT NOT NULL ,
  nDComCantidad int not null ,
  dDcomSubTotal double not null ,
  PRIMARY KEY (nDComID) );


create table TEnvio(
    nEnvID INT NOT NULL AUTO_INCREMENT ,
    nEnvTipo int not null ,
    cEnvCorreo varchar(45) null ,
    cEnvNombre varchar(45) null ,
    cEnvDistrito varchar(45) null ,
    cEnvDireccion varchar(45) null ,
    cEnvTelefono varchar(8) null ,
    nEnvDni int null , 
    PRIMARY KEY (nEnvID) );


Create table Pasarela (
    nPasID int not null AUTO_INCREMENT ,
    cPasPais varchar(30) not null,
    nPasNumTarjeta int not null ,
    cPasFecVencimiento varchar(6) NOT NULL ,
    nPasCodVerificacion int NOT NULL ,
    cPasDireccion VARCHAR(50) NOT NULL ,
PRIMARY KEY (nPasID) );
