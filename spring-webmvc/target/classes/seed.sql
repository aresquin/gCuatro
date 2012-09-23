insert into usuarios (nombre,correo,password) values ('gian.corzo','gian.corzo@antartec.com','admin');

/* Ingreso de estados */
insert into estados (ti_estado,de_tabla,fe_creacion,us_creacion) 
values ('Activo','Categorias',SYSDATE(),'jp_yabiku@hotmail.com');
insert into estados (ti_estado,de_tabla,fe_creacion,us_creacion) 
values ('Inactivo','Categorias',SYSDATE(),'jp_yabiku@hotmail.com');

/* Ingreso de categorias */
insert into categorias (id_categoria,no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values ('CAT001','Agricultura','../image/agricultura.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into categorias (id_categoria,no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values ('CAT002','Ganaderia','../image/ganaderia.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into categorias (id_categoria,no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values ('CAT003','Mineria','../image/mineria.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into categorias (id_categoria,no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values ('CAT004','Pesca','../image/pesca.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into categorias (id_categoria,no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values ('CAT005','Caza','../image/caza.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');
insert into categorias (id_categoria,no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion)
values ('CAT006','Deporte','../image/deporte.jpg',1,SYSDATE(),'jp_yabiku@hotmail.com');

/* Ingreso de subcategorias */
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Organica','CAT001',SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Tradicional','CAT001',SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Industrial','CAT001',SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Ovino','CAT002',SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Vacuno','CAT002',SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Porcino','CAT002',SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('A cielo abierto','CAT003',SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Subterranea','CAT003',SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Pesca artesanal','CAT004',SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Pesca industrial','CAT004',SYSDATE(),'jp_yabiku@hotmail.com');
insert into subcategorias (no_subcategoria,id_categoria,fe_creacion,us_creacion)
values ('Pesca deportiva','CAT004',SYSDATE(),'jp_yabiku@hotmail.com');
