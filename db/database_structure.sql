-- Creación de Base de Datos

CREATE SCHEMA `la_mejor_cocina_db` ;

-- Creación de Tablas

CREATE TABLE `la_mejor_cocina_db`.`cliente` (
  `id_cliente` INT(15) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido1` VARCHAR(45) NOT NULL,
  `apellido2` VARCHAR(45),
  `observaciones` VARCHAR(250),
  PRIMARY KEY (`id_cliente`));
  
CREATE TABLE `la_mejor_cocina_db`.`mesa` (
  `id_mesa` INT(3) NOT NULL AUTO_INCREMENT ,
  `num_max_comensales` INT(2) NOT NULL,
  `ubicacion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_mesa`));

CREATE TABLE `la_mejor_cocina_db`.`camarero` (
  `id_camarero` INT(15) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido1` VARCHAR(45) NOT NULL,
  `apellido2` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_camarero`));

CREATE TABLE `la_mejor_cocina_db`.`cocinero` (
  `id_cocinero` INT(15) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido1` VARCHAR(45) NOT NULL,
  `apellido2` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_cocinero`));

CREATE TABLE `la_mejor_cocina_db`.`factura` (
  `id_factura` INT(15) NOT NULL AUTO_INCREMENT ,
  `id_cliente` INT(15) NOT NULL,
  `id_camarero` INT(15) NOT NULL,
  `id_mesa` INT(3) NOT NULL,
  `fecha_factura` DATETIME NOT NULL,
  PRIMARY KEY (`id_factura`));

CREATE TABLE `la_mejor_cocina_db`.`detalle_factura` (
  `id_detalle_factura` INT(15) NOT NULL AUTO_INCREMENT ,
  `id_factura` INT(15) NOT NULL,
  `id_cocinero` INT(15) NOT NULL,
  `plato` VARCHAR(45) NOT NULL,
  `importe` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_detalle_factura`));
     
 -- Creación de Indices
	 
ALTER TABLE `la_mejor_cocina_db`.`factura` 
ADD INDEX `id_cliente_idx` (`id_cliente` ASC) ,
ADD INDEX `id_camarero_idx` (`id_camarero` ASC) ,
ADD INDEX `id_mesa_idx` (`id_mesa` ASC) ;

ALTER TABLE `la_mejor_cocina_db`.`detalle_factura` 
ADD INDEX `id_factura_idx` (`id_factura` ASC) ,
ADD INDEX `id_cocinero_idx` (`id_cocinero` ASC) ;

-- Creación de Llaves Foraneas

ALTER TABLE `la_mejor_cocina_db`.`factura` 
ADD CONSTRAINT `fk_factura_cliente_pk`
  FOREIGN KEY (`id_cliente`)
  REFERENCES `la_mejor_cocina_db`.`cliente` (`id_cliente`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `la_mejor_cocina_db`.`factura` 
ADD CONSTRAINT `fk_factura_camarero_pk`
  FOREIGN KEY (`id_camarero`)
  REFERENCES `la_mejor_cocina_db`.`camarero` (`id_camarero`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
  
ALTER TABLE `la_mejor_cocina_db`.`factura` 
ADD CONSTRAINT `fk_factura_mesa_pk`
  FOREIGN KEY (`id_mesa`)
  REFERENCES `la_mejor_cocina_db`.`mesa` (`id_mesa`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
  
  ALTER TABLE `la_mejor_cocina_db`.`detalle_factura` 
ADD CONSTRAINT `fk_detalle_factura_factura`
  FOREIGN KEY (`id_factura`)
  REFERENCES `la_mejor_cocina_db`.`factura` (`id_factura`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `la_mejor_cocina_db`.`detalle_factura` 
ADD CONSTRAINT `fk_detalle_factura_cocinero`
  FOREIGN KEY (`id_cocinero`)
  REFERENCES `la_mejor_cocina_db`.`cocinero` (`id_cocinero`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

