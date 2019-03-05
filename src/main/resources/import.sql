INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(1, 'Andres', 'Guzman', 'profesor@bolsadeideas.com', '2018-08-28', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(2, 'Luis', 'Alas', 'profesor@bolsadeideas.com', '2018-09-28', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(3, 'juan', 'Alas', 'profesor@bolsadeideas.com', '2018-09-28', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(4, 'Luis', 'Alas', 'profesor@bolsadeideas.com', '2018-09-28', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(5, 'Luis', 'Alas', 'profesor@bolsadeideas.com', '2018-09-28', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(6, 'Luis', 'Alas', 'profesor@bolsadeideas.com', '2018-09-28', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(7, 'Luis', 'Alas', 'profesor@bolsadeideas.com', '2018-09-28', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(8, 'Andres', 'Guzman', 'profesor@bolsadeideas.com', '2018-08-28', '');

INSERT INTO productos (id, nombre, precio, create_at) VALUES(1, 'Sony noteBook', 550, NOW());
INSERT INTO productos (id, nombre, precio, create_at) VALUES(2, 'Sony camera', 936, NOW());
INSERT INTO productos (id, nombre, precio, create_at) VALUES(3, 'Sony TV', 600, NOW());
INSERT INTO productos (id, nombre, precio, create_at) VALUES(4, 'Sony Watch',350, NOW());

INSERT INTO usuario(id, username, password, enabled) VALUES (1, 'andres', '$2a$10$tcA4vDyKeDEzIp67t9w/X.3Q.myRKqRFyhxSNc76WvZPxBiwPo5V6', true);
INSERT INTO usuario(id, username, password, enabled) VALUES (2, 'admin', '$2a$10$tcA4vDyKeDEzIp67t9w/X.3Q.myRKqRFyhxSNc76WvZPxBiwPo5V6', true);

INSERT INTO rol (id, user_id, authority, rol_descripcion, rol_estado) VALUES (1, 1, 'ROLE_USER', '  ', true);
INSERT INTO rol (id, user_id, authority, rol_descripcion, rol_estado) VALUES (2, 2, 'ROLE_USER', '  ', true);
INSERT INTO rol (id, user_id, authority, rol_descripcion, rol_estado) VALUES (3, 2, 'ROLE_ADMIN', '  ', true);


INSERT INTO menu (menu_id, menu_nombre, menu_url, menu_icono, menu_configurable, menu_es_asignable) VALUES (1, 'inicio', 'http://localhost:8080/inicio', 'icon ', true, true);
INSERT INTO menu (menu_id, menu_nombre, menu_url, menu_icono, menu_configurable, menu_es_asignable) VALUES (2, 'listar', 'http://localhost:8080/listar', 'icon ', true, true);


INSERT INTO asignacion_rol_menu(rol_id, menu_id) VALUES(1,1);
INSERT INTO asignacion_rol_menu(rol_id, menu_id) VALUES(2,1);
INSERT INTO asignacion_rol_menu(rol_id, menu_id) VALUES(2,2);
