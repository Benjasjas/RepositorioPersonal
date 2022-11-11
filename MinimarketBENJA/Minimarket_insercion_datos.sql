insert into minimarket_schema.proveedor (nombre) values ('proveedor 1');

insert into minimarket_schema.boletaproveedor (proveedor_id, fecha) values (1, '2022-05-14');

insert into minimarket_schema.tipoproducto (nombre) values ('galletas');
insert into minimarket_schema.tipoproducto (nombre) values ('bebidas');
insert into minimarket_schema.tipoproducto (nombre) values ('lacteos');
insert into minimarket_schema.tipoproducto (nombre) values ('carnes');

insert into minimarket_schema.boleta (fecha) values ('2022-11-10');
insert into minimarket_schema.boleta (fecha) values ('2022-11-9');

insert into minimarket_schema.producto (nombre, precio_compra, precio_venta, stock, proveedor_id, tipoProducto_id) 
values ('morochitas', 375, 500, 100, 1, 1); 
insert into minimarket_schema.producto (nombre, precio_compra, precio_venta, stock, proveedor_id, tipoProducto_id) 
values ('donuts', 450, 600, 100, 1, 1); 
insert into minimarket_schema.producto (nombre, precio_compra, precio_venta, stock, proveedor_id, tipoProducto_id) 
values ('cocacola', 675, 900, 500, 1, 2); 
insert into minimarket_schema.producto (nombre, precio_compra, precio_venta, stock, proveedor_id, tipoProducto_id) 
values ('leche con chocolate', 1125, 1500, 500, 1, 3); 
insert into minimarket_schema.producto (nombre, precio_compra, precio_venta, stock, proveedor_id, tipoProducto_id) 
values ('posta rosada', 6000, 8000, 50, 1, 4); 

insert into minimarket_schema.detalleboletaproveedor (cantidad, boletaProveedor_id, producto_id) 
values (10, 1, 1);
insert into minimarket_schema.detalleboletaproveedor (cantidad, boletaProveedor_id, producto_id) 
values (10, 1, 2);
insert into minimarket_schema.detalleboletaproveedor (cantidad, boletaProveedor_id, producto_id) 
values (10, 1, 3);
insert into minimarket_schema.detalleboletaproveedor (cantidad, boletaProveedor_id, producto_id) 
values (10, 1, 4);
insert into minimarket_schema.detalleboletaproveedor (cantidad, boletaProveedor_id, producto_id) 
values (10, 1, 5);

insert into minimarket_schema.detalle (cantidad, producto_id, boleta_id) values (3,1, 1);
insert into minimarket_schema.detalle (cantidad, producto_id, boleta_id) values (1,2, 1);
insert into minimarket_schema.detalle (cantidad, producto_id, boleta_id) values (3,3, 1);
insert into minimarket_schema.detalle (cantidad, producto_id, boleta_id) values (2,4, 1);
insert into minimarket_schema.detalle (cantidad, producto_id, boleta_id) values (1,5, 1);

insert into minimarket_schema.detalle (cantidad, producto_id, boleta_id) values (1,1, 2);
insert into minimarket_schema.detalle (cantidad, producto_id, boleta_id) values (3,2, 2);
insert into minimarket_schema.detalle (cantidad, producto_id, boleta_id) values (2,3, 2);
insert into minimarket_schema.detalle (cantidad, producto_id, boleta_id) values (4,4, 2);
insert into minimarket_schema.detalle (cantidad, producto_id, boleta_id) values (5,5, 2);


select total_invertido AS 'compras anuales', total_vendido AS 'ventas anuales', 
(total_vendido - total_invertido) AS 'ganancias' from (
	select sum(d.cantidad * p.precio_venta) as total_vendido
	from minimarket_schema.detalle d
	join minimarket_schema.producto p 
	on p.id = d.producto_id
	join minimarket_schema.boleta b
	on b.id = d.boleta_id
	WHERE b.fecha BETWEEN '2022-01-01' AND '2022-12-31'
) as ventas, (
	SELECT sum(dbp.cantidad * p.precio_compra) AS total_invertido
    FROM minimarket_schema.boletaproveedor bp
    JOIN minimarket_schema.detalleboletaproveedor dbp
    ON bp.id = dbp.boletaProveedor_id
    JOIN minimarket_schema.producto p
    ON p.id = dbp.producto_id
    WHERE bp.fecha BETWEEN '2022-01-01' AND '2022-12-31'
) as compras;    