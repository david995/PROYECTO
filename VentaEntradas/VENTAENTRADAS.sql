-- ESTA PRIMERA PARTE PUEDE OBVIARSE (Y CONVIENE HACERLO). CREAR LA BASE DE DATOS MANUALMENTE MEDIANTE INTERFAZ. 

CREATE DATABASE ventaentradas
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'es_ES.UTF-8'
       LC_CTYPE = 'es_ES.UTF-8'
       CONNECTION LIMIT = -1;

-- SELECCIONAR LA BASE DE DATOS ADECUADA E INSERTAR ESTAS LINEAS.

CREATE TABLE IF NOT EXISTS usuario (
dni varchar(9) NOT NULL,
nombre varchar (20) NOT NULL,
apellidos varchar (40) NOT NULL,
email varchar (30) NOT NULL,
contraseña varchar(20) NOT NULL,
telefono varchar(15) NOT NULL,
puntos integer NOT NULL,
PRIMARY KEY (dni)
);

CREATE TABLE IF NOT EXISTS direccion_usuario (
dni varchar (9) NOT NULL references usuario(dni),
direccion varchar (75) NOT NULL,
poblacion varchar (20) NOT NULL,
codigo_postal varchar (5) NOT NULL,
pais varchar (20) NOT NULL,
PRIMARY KEY (dni)
);

CREATE TABLE IF NOT EXISTS evento (
id varchar (20) NOT NULL,
nombre varchar (75) NOT NULL,
estado varchar (20) NOT NULL,
fecha_hora timestamp NOT NULL,
sala varchar (20), 
asiento varchar (20),
datos varchar (100),
num_entradas_disponibles integer,
PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS lugar_evento (
id varchar (20) NOT NULL,
nombre varchar (50) NOT NULL,
tipo varchar (20),
aforo integer,
direccion varchar (75) NOT NULL,
poblacion varchar (20) NOT NULL,
codigo_postal varchar (5) NOT NULL,
pais varchar (20) NOT NULL,
id_evento varchar (20) NOT NULL references evento (id),
PRIMARY KEY (id) 
);

CREATE TABLE IF NOT EXISTS datos_bancarios (
num_tarjeta varchar (20) NOT NULL,
dni_titular varchar (9) NOT NULL,
fecha_caducidad timestamp NOT NULL,
cod_seguridad integer NOT NULL,
tipo_tarjeta varchar (20),
PRIMARY KEY (num_tarjeta)
);

CREATE TABLE IF NOT EXISTS oferta (
id varchar (20) NOT NULL,
fecha_inicio timestamp NOT NULL,
fecha_fin timestamp NOT NULL,
descuento integer NOT NULL,
coste_puntos integer NOT NULL,
id_evento varchar (20) NOT NULL references evento (id),
PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS detalles_compra (
num_tarjeta varchar (20) NOT NULL references datos_bancarios (num_tarjeta),
dni varchar(9) references usuario (dni),
id_evento varchar (20) NOT NULL references evento (id),
fecha_hora timestamp NOT NULL,
PRIMARY KEY (num_tarjeta, dni, fecha_hora)
);





