create table produk(
    id varchar(64) not null primary key,
    toko_id varchar(64)not null,
    nama varchar (64) not null,
    harga int not null,
    tanggal timestamp not null
)engine = InnoDB;

alter table produk add constraint fk_produk_toko foreign key (toko_id)
reference toko (id) on update cascade on delete restrict;

insert into produk (id, toko_id, nama,harga,tanggal)
values  ('001','001','Nike Vapoor Max',500000,now()),
        ('002','002','Adidas Ultraboost 4.0',400000,now()),
        ('003','002','Adidas Fallcon',550000,now()),
        ('004','004','Nike Jordan',680000,now());

