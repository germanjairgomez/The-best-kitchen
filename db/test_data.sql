-- Camareros de prueba

INSERT INTO `la_mejor_cocina_db`.`camarero` (`id_camarero`, `nombre`, `apellido1`, `apellido2`) VALUES ('102052525', 'Camarero Prueba 1', 'Ap Camarero 1', 'Ap2 Camarero 1');
INSERT INTO `la_mejor_cocina_db`.`camarero` (`id_camarero`, `nombre`, `apellido1`, `apellido2`) VALUES ('202052525', 'Camarero Prueba 2', 'Ap Camarero 2', 'Ap2 Camarero 2');
INSERT INTO `la_mejor_cocina_db`.`camarero` (`id_camarero`, `nombre`, `apellido1`, `apellido2`) VALUES ('302052525', 'Camarero Prueba 3', 'Ap Camarero 3', 'Ap2 Camarero 3');
INSERT INTO `la_mejor_cocina_db`.`camarero` (`id_camarero`, `nombre`, `apellido1`, `apellido2`) VALUES ('402052525', 'Camarero Prueba 4', 'Ap Camarero 4', 'Ap2 Camarero 4');
INSERT INTO `la_mejor_cocina_db`.`camarero` (`id_camarero`, `nombre`, `apellido1`, `apellido2`) VALUES ('502052525', 'Camarero Prueba 5', 'Ap Camarero 5', 'Ap2 Camarero 5');
INSERT INTO `la_mejor_cocina_db`.`camarero` (`id_camarero`, `nombre`, `apellido1`, `apellido2`) VALUES ('602052525', 'Camarero Prueba 6', 'Ap Camarero 6', 'Ap2 Camarero 6');

-- Clientes de prueba

INSERT INTO `la_mejor_cocina_db`.`cliente` (`id_cliente`, `nombre`, `apellido1`, `apellido2`, `observaciones`) VALUES ('115625', 'Cliente de prueba 1', 'Ap Cliente 1', 'Ap2 Cliente 1', 'Obs1');
INSERT INTO `la_mejor_cocina_db`.`cliente` (`id_cliente`, `nombre`, `apellido1`, `apellido2`, `observaciones`) VALUES ('215625', 'Cliente de prueba 2', 'Ap Cliente 2', 'Ap2 Cliente 2', 'Obs2');
INSERT INTO `la_mejor_cocina_db`.`cliente` (`id_cliente`, `nombre`, `apellido1`, `apellido2`, `observaciones`) VALUES ('315625', 'Cliente de prueba 3', 'Ap Cliente 3', 'Ap2 Cliente 3', 'Obs3');
INSERT INTO `la_mejor_cocina_db`.`cliente` (`id_cliente`, `nombre`, `apellido1`, `apellido2`, `observaciones`) VALUES ('415625', 'Cliente de prueba 4', 'Ap Cliente 4', 'Ap2 Cliente 4', 'Obs4');
INSERT INTO `la_mejor_cocina_db`.`cliente` (`id_cliente`, `nombre`, `apellido1`, `apellido2`, `observaciones`) VALUES ('515625', 'Cliente de prueba 5', 'Ap Cliente 5', 'Ap2 Cliente 5', 'Obs5');
INSERT INTO `la_mejor_cocina_db`.`cliente` (`id_cliente`, `nombre`, `apellido1`, `apellido2`, `observaciones`) VALUES ('615625', 'Cliente de prueba 6', 'Ap Cliente 6', 'Ap2 Cliente 6', 'Obs6');

-- Cocinero de prueba

INSERT INTO `la_mejor_cocina_db`.`cocinero` (`id_cocinero`, `nombre`, `apellido1`, `apellido2`) VALUES ('131561', 'Cocinero de prueba 1', 'Ap cocinero 1', 'Ap2 cocinero 1');
INSERT INTO `la_mejor_cocina_db`.`cocinero` (`id_cocinero`, `nombre`, `apellido1`, `apellido2`) VALUES ('231561', 'Cocinero de prueba 2', 'Ap cocinero 2', 'Ap2 cocinero 2');
INSERT INTO `la_mejor_cocina_db`.`cocinero` (`id_cocinero`, `nombre`, `apellido1`, `apellido2`) VALUES ('331561', 'Cocinero de prueba 3', 'Ap cocinero 3', 'Ap2 cocinero 3');
INSERT INTO `la_mejor_cocina_db`.`cocinero` (`id_cocinero`, `nombre`, `apellido1`, `apellido2`) VALUES ('431561', 'Cocinero de prueba 4', 'Ap cocinero 4', 'Ap2 cocinero 4');
INSERT INTO `la_mejor_cocina_db`.`cocinero` (`id_cocinero`, `nombre`, `apellido1`, `apellido2`) VALUES ('531561', 'Cocinero de prueba 5', 'Ap cocinero 5', 'Ap2 cocinero 5');
INSERT INTO `la_mejor_cocina_db`.`cocinero` (`id_cocinero`, `nombre`, `apellido1`, `apellido2`) VALUES ('631561', 'Cocinero de prueba 6', 'Ap cocinero 6', 'Ap2 cocinero 6');

-- Mesas de prueba

INSERT INTO `la_mejor_cocina_db`.`mesa` (`id_mesa`, `num_max_comensales`, `ubicacion`) VALUES ('1', '4', 'primer piso');
INSERT INTO `la_mejor_cocina_db`.`mesa` (`id_mesa`, `num_max_comensales`, `ubicacion`) VALUES ('2', '2', 'primer piso');
INSERT INTO `la_mejor_cocina_db`.`mesa` (`id_mesa`, `num_max_comensales`, `ubicacion`) VALUES ('3', '4', 'primer piso');
INSERT INTO `la_mejor_cocina_db`.`mesa` (`id_mesa`, `num_max_comensales`, `ubicacion`) VALUES ('4', '6', 'primer piso');
INSERT INTO `la_mejor_cocina_db`.`mesa` (`id_mesa`, `num_max_comensales`, `ubicacion`) VALUES ('5', '6', 'primer piso');
INSERT INTO `la_mejor_cocina_db`.`mesa` (`id_mesa`, `num_max_comensales`, `ubicacion`) VALUES ('6', '2', 'primer piso');

-- Facturas de prueba

INSERT INTO `la_mejor_cocina_db`.`factura` (`id_factura`, `id_cliente`, `id_camarero`, `id_mesa`, `fecha_factura`) VALUES ('1', '115625', '102052525', '1', '2019-03-01');
INSERT INTO `la_mejor_cocina_db`.`factura` (`id_factura`, `id_cliente`, `id_camarero`, `id_mesa`, `fecha_factura`) VALUES ('2', '115625', '502052525', '1', '2019-03-01');
INSERT INTO `la_mejor_cocina_db`.`factura` (`id_factura`, `id_cliente`, `id_camarero`, `id_mesa`, `fecha_factura`) VALUES ('3', '415625', '102052525', '2', '2019-02-01');
INSERT INTO `la_mejor_cocina_db`.`factura` (`id_factura`, `id_cliente`, `id_camarero`, `id_mesa`, `fecha_factura`) VALUES ('4', '615625', '102052525', '1', '2019-04-01');

-- Detalle de factura de prueba

INSERT INTO `la_mejor_cocina_db`.`detalle_factura` (`id_detalle_factura`, `id_factura`, `id_cocinero`, `plato`, `importe`) VALUES ('1', '1', '431561', 'Costillas BBQ', '30000');
INSERT INTO `la_mejor_cocina_db`.`detalle_factura` (`id_detalle_factura`, `id_factura`, `id_cocinero`, `plato`, `importe`) VALUES ('2', '2', '631561', 'Churrasco', '27000');
INSERT INTO `la_mejor_cocina_db`.`detalle_factura` (`id_detalle_factura`, `id_factura`, `id_cocinero`, `plato`, `importe`) VALUES ('3', '3', '431561', 'Arroz con Pollo', '18000');
INSERT INTO `la_mejor_cocina_db`.`detalle_factura` (`id_detalle_factura`, `id_factura`, `id_cocinero`, `plato`, `importe`) VALUES ('4', '4', '331561', 'Ajiaco', '9000');
