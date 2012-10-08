insert into usuarios (nombre,correo,password) values ('gian.corzo','gian.corzo@antartec.com','admin');

/* Ingreso de estados */
insert into Estado (cEstNombre,cEstFecCrea,nUsuCrea) 
values ('Activo',SYSDATE(),1);
insert into Estado (cEstNombre,cEstFecCrea,nUsuCrea) 
values ('Inactivo',SYSDATE(),1);

/* Ingreso de categorias */
insert into Categoria (cCatNombre,sCatRutaImagen,nEstID,cCatFecCrea,nUsuCrea)
values ('Agricultura','../image/agricultura.jpg',1,SYSDATE(),1);
insert into Categoria (cCatNombre,sCatRutaImagen,nEstID,cCatFecCrea,nUsuCrea)
values ('Ganaderia','../image/ganaderia.jpg',1,SYSDATE(),1);
insert into Categoria (cCatNombre,sCatRutaImagen,nEstID,cCatFecCrea,nUsuCrea)
values ('Mineria','../image/mineria.jpg',1,SYSDATE(),1);
insert into Categoria (cCatNombre,sCatRutaImagen,nEstID,cCatFecCrea,nUsuCrea)
values ('Pesca','../image/pesca.jpg',1,SYSDATE(),1);
insert into Categoria (cCatNombre,sCatRutaImagen,nEstID,cCatFecCrea,nUsuCrea)
values ('Caza','../image/caza.jpg',1,SYSDATE(),1);
insert into Categoria (cCatNombre,sCatRutaImagen,nEstID,cCatFecCrea,nUsuCrea)
values ('Deporte','../image/deporte.jpg',1,SYSDATE(),1);

/* Ingreso de subcategorias */
insert into Subcategoria (cSCatNombre,nCatID,cSCatFecCrea,nUsuCrea)
values ('Organica',1,SYSDATE(),1);
insert into Subcategoria (cSCatNombre,nCatID,cSCatFecCrea,nUsuCrea)
values ('Tradicional',1,SYSDATE(),1);
insert into Subcategoria (cSCatNombre,nCatID,cSCatFecCrea,nUsuCrea)
values ('Ovino',2,SYSDATE(),1);
insert into Subcategoria (cSCatNombre,nCatID,cSCatFecCrea,nUsuCrea)
values ('Vacuno',2,SYSDATE(),1);
insert into Subcategoria (cSCatNombre,nCatID,cSCatFecCrea,nUsuCrea)
values ('Porcino',2,SYSDATE(),1);
insert into Subcategoria (cSCatNombre,nCatID,cSCatFecCrea,nUsuCrea)
values ('A cielo abierto',3,SYSDATE(),1);
insert into Subcategoria (cSCatNombre,nCatID,cSCatFecCrea,nUsuCrea)
values ('Subterranea',3,SYSDATE(),1);
insert into Subcategoria (cSCatNombre,nCatID,cSCatFecCrea,nUsuCrea)
values ('Pesca artesanal',4,SYSDATE(),1);
insert into Subcategoria (cSCatNombre,nCatID,cSCatFecCrea,nUsuCrea)
values ('Pesca industrial',4,SYSDATE(),1);
insert into Subcategoria (cSCatNombre,nCatID,cSCatFecCrea,nUsuCrea)
values ('Pesca deportiva',4,SYSDATE(),1);


/*insertar plannegocio*/
insert into PlanNegocio( cPlaTitulo, nCatID, cPlaVision, cPlaRazon, cPlaTiempo, nPlaInvTotal, nPlaNeto, nPlaROI, nPlaPreVenta, nEstID  , nUsuCrea, cPlaFecCrea)
values ('Plan de Negocio 1', 1, 'Vision 1', 'Razon indescriptible', '6 meses',123456, 123456, 12345, 1234567, 1, 1, SYSDATE());
insert into PlanNegocio( cPlaTitulo, nCatID, cPlaVision, cPlaRazon, cPlaTiempo, nPlaInvTotal, nPlaNeto, nPlaROI, nPlaPreVenta, nEstID  , nUsuCrea, cPlaFecCrea)
values ('Plan de Negocio 1', 2, 'Vision 2', 'Razon indescriptible', '6 meses',12.3456, 1234.56, 123.45, 12345.67, 1, 1, SYSDATE());
