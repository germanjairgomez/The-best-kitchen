Select * 
From (
select c.*, sum(df.importe) as Suma
from factura f
join detalle_factura df on f.id_factura = df.id_factura
join cliente c on c.id_cliente = f.id_cliente
--  where sum(df.importe) > 50000
group by c.id_cliente
) T
where T.Suma > 100000