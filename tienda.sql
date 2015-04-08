CREATE DATABASE tienda;
USE DATABASE tienda;
CREATE TABLE cliente (id int CONSTRAINT PRIMARY KEY pkCliente (id));
ALTER TABLE cliente ADD COLUMN pisto float;
CREATE TABLE producto (id int CONSTRAINT PRIMARY KEY pkPrecio (id));
ALTER TABLE producto ADD COLUMN  descripcion char(20);
ALTER TABLE producto ADD COLUMN  precio float ;
CREATE TABLE recibo (idCliente int, idProducto int, totalCompra float,id int);
ALTER TABLE recibo ADD CONSTRAINT PRIMARY KEY pkRecibo(id); ALTER TABLE recibo ADD CONSTRAINT FOREIGN KEY fkReciboClie (idCliente) REFERENCES cliente(id);
ALTER TABLE recibo ADD CONSTRAINT FOREIGN KEY fkReciboProd (idProducto) REFERENCES producto(id)
