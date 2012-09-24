insert into usuarios (nombre,correo,password) values ('gian.corzo','gian.corzo@antartec.com','admin');

/* Ingreso de estados */
insert into estados (ti_estado,de_tabla,fe_creacion,us_creacion) 
values ('Activo','Categorias',SYSDATE(),'jp_yabiku@hotmail.com');
insert into estados (ti_estado,de_tabla,fe_creacion,us_creacion) 
values ('Inactivo','Categorias',SYSDATE(),'jp_yabiku@hotmail.com');

/* Ingreso de categorias */
insert into categorias (no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values ('Agricultura','../image/agricultura.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into categorias (no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values ('Ganaderia','../image/ganaderia.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into categorias (no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values ('Mineria','../image/mineria.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into categorias (no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values ('Pesca','../image/pesca.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into categorias (no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values (,'Caza','../image/caza.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into categorias (no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values ('Deporte','../image/deporte.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');

/* Ingreso de subcategorias */
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Organica',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Tradicional',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Industrial',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Ovino',2,SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Vacuno',2,SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Porcino',2,SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('A cielo abierto',3,SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Subterranea',3,SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Pesca artesanal',4,SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Pesca industrial',4,SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Pesca deportiva',4,SYSDATE(),'jp_yabiku@hotmail.com');
