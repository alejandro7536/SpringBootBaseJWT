INSERT INTO rol (id, user_id, authority, rol_descripcion, rol_estado) VALUES (1, 1, 'ROLE_USER', '  ', true);
INSERT INTO rol (id, user_id, authority, rol_descripcion, rol_estado) VALUES (2, 2, 'ROLE_USER', '  ', true);
INSERT INTO rol (id, user_id, authority, rol_descripcion, rol_estado) VALUES (3, 2, 'ROLE_ADMIN', '  ', true);


INSERT INTO menu (menu_id, menu_nombre, menu_url, menu_icono, menu_configurable, menu_es_asignable) VALUES (1, 'inicio', 'http://localhost:8080/inicio', 'icon ', true, true);
INSERT INTO menu (menu_id, menu_nombre, menu_url, menu_icono, menu_configurable, menu_es_asignable) VALUES (2, 'listar', 'http://localhost:8080/listar', 'icon ', true, true);


INSERT INTO asignacion_rol_menu(rol_id, menu_id) VALUES(1,1);
INSERT INTO asignacion_rol_menu(rol_id, menu_id) VALUES(2,1);
INSERT INTO asignacion_rol_menu(rol_id, menu_id) VALUES(2,2);

INSERT INTO usuario(id, username, password, enabled, rol_id) VALUES (1, 'andres', '$2a$10$tcA4vDyKeDEzIp67t9w/X.3Q.myRKqRFyhxSNc76WvZPxBiwPo5V6', true,1);
INSERT INTO usuario(id, username, password, enabled, rol_id) VALUES (2, 'admin', '$2a$10$tcA4vDyKeDEzIp67t9w/X.3Q.myRKqRFyhxSNc76WvZPxBiwPo5V6', true,3);
