-- consulta 1
select dp.pedido_id as Id_Pedido, plato.nombre as Nombre_Plato, dp.Cantidad as Cantidad
from Plato
join detalle_pedido dp on plato.id = dp.plato_id
where dp.pedido_id = 1;

-- consulta 2
select mesa.numero as Numero_Mesa, count(pedido.id) as Cantidad_Pedidos
from mesa
left join pedido on mesa.id = pedido.mesa_id
group by mesa.numero;

-- consulta 3
select camarero.nombre as Nombre_Camarero, sum(detalle_pedido.subtotal) as Monto_Ventas
from camarero
left join pedido on camarero.id = pedido.camarero_id
left join detalle_pedido on pedido.id = detalle_pedido.pedido_id
group by camarero.nombre
order by camarero.nombre desc;

-- consulta 4

select plato.nombre as Plato_Mas_Solicitado, sum(detalle_pedido.cantidad) as Cantidad_Solicitudes
from plato
join detalle_pedido on plato.id = detalle_pedido.plato_id
group by plato.nombre
order by Cantidad_Solicitudes desc
limit 1;

-- consulta 5

select plato.nombre as Plato_Vendido, sum(detalle_pedido.subtotal) as Valor_Total
from plato
join detalle_pedido on plato.id = detalle_pedido.plato_id
group by plato.nombre
order by Valor_Total asc;
