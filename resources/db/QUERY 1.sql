select c.nombre, c.apellido1, c.apellido2  , f.fecha_factura, sum(df.importe)
from factura as f
 join detalle_factura as df on f.id_factura = df.id_factura
right join camarero as c on c.id_camarero = f.id_camarero
 group by c.id_camarero, month(f.fecha_factura)
 -- order by month(f.fecha_factura)