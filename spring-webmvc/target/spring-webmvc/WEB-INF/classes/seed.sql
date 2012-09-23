insert into usuarios (nombre,correo,password) values ('gian.corzo','gian.corzo@antartec.com','admin');
insert into estados (ti_estado,de_tabla,fe_creacion,us_creacion) 
values ('Activo','Categorias',SYSDATE(),'jp_yabiku@hotmail.com');
insert into estados (ti_estado,de_tabla,fe_creacion,us_creacion) 
values ('Inactivo','Categorias',SYSDATE(),'jp_yabiku@hotmail.com');
insert into categorias (id_categoria,no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values ('CAT001','Agricultura','../image/agricultura.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');