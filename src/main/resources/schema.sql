CREATE TABLE clientes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    email VARCHAR(255),
    direccion VARCHAR(255),
    dni BIGINT
);

CREATE TABLE productos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    descripcion VARCHAR(255),
    precio DECIMAL,
    stock BIGINT
);

CREATE TABLE ventas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cliente_id BIGINT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);

CREATE TABLE venta_producto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    venta_id BIGINT,
    producto_id BIGINT,
    FOREIGN KEY (venta_id) REFERENCES ventas(id),
    FOREIGN KEY (producto_id) REFERENCES productos(id)
);
