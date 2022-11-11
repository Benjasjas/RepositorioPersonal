create schema if not exists minimarket_schema;

create table `minimarket_schema`.`producto` (
`id` int not null auto_increment,
`nombre` varchar (255) not null,
`precio_compra` int unsigned not  null,
`precio_venta` int unsigned not null,
`stock` int unsigned not null,
primary key (`id`));


create table `minimarket_schema`.`detalle`(
`id` int not null auto_increment,
`cantidad` int unsigned not null,
primary key (`id`));

create table `minimarket_schema`.`boleta`(
`id` int not null auto_increment,
`fecha` date not null,
primary key (`id`));

create table `minimarket_schema`.`boletaProveedor`(
`id` int not null auto_increment,
`fecha` date not null,
primary key (`id`));

create table `minimarket_schema`.`detalleBoletaProveedor`(
`id` int not null auto_increment,
`cantidad` int unsigned not null,
primary key (`id`));

create table `minimarket_schema`.`proveedor`(
`id` int not null auto_increment,
`nombre` varchar (255) not null,
primary key (`id`));

create table `minimarket_schema`.`tipoProducto`(
`id` int not null auto_increment,
`nombre` varchar (255) not null,
primary key (`id`));

#ALTER TABLE DE PRODUCTO
alter table minimarket_schema.producto add proveedor_id int not null;
alter table minimarket_schema.producto add constraint productoProveedor foreign key (proveedor_id) references minimarket_schema.proveedor(id);
alter table minimarket_schema.producto add tipoProducto_id int not null;
alter table minimarket_schema.producto add constraint producto_tipoProducto foreign key (tipoProducto_id) references minimarket_schema.tipoProducto(id);

#ALTER TABLE DE DETALLE
alter table minimarket_schema.detalle add producto_id int not null;
alter table minimarket_schema.detalle add constraint detalleProducto foreign key (producto_id) references minimarket_schema.producto(id);
alter table minimarket_schema.detalle add boleta_id int not null;
alter table minimarket_schema.detalle add constraint detalleBoleta foreign key (boleta_id) references minimarket_schema.boleta(id);

#ALTER TABLE DE DETALLE BOLETA PROVEEDOR
alter table minimarket_schema.detalleboletaproveedor add boletaProveedor_id int not null;
alter table minimarket_schema.detalleboletaproveedor add constraint detalleboletaproveedor foreign key (boletaProveedor_id) references minimarket_schema.boletaproveedor(id);
alter table minimarket_schema.detalleboletaproveedor add producto_id int not null;
alter table minimarket_schema.detalleboletaproveedor add constraint detalleboletaproveedorProducto foreign key (producto_id) references minimarket_schema.producto(id);

#ALTER TABLE DE BOLETA PROVEEDOR
alter table minimarket_schema.boletaproveedor add proveedor_id int not null;
alter table minimarket_schema.boletaproveedor add constraint boletaproveedor foreign key (proveedor_id) references minimarket_schema.proveedor(id);