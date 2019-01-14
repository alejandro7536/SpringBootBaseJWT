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

INSERT INTO users (id, username, password, enabled) VALUES (1, 'andres', '$2a$10$tcA4vDyKeDEzIp67t9w/X.3Q.myRKqRFyhxSNc76WvZPxBiwPo5V6', 1);
INSERT INTO users (id, username, password, enabled) VALUES (2, 'admin', '$10$p/B0R8bV2QM1exAg5FI5/unuSzCALxQv4sQ75PrEnVrkA0iYrDQgG',1);

INSERT INTO `authorities` (id, user_id, authority) VALUES (1, 1, 'ROLE_USER');
INSERT INTO `authorities` (id, user_id, authority) VALUES (2, 2, 'ROLE_USER');
INSERT INTO `authorities` (id, user_id, authority) VALUES (3, 2, 'ROLE_ADMIN');