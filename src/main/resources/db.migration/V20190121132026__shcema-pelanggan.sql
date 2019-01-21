create table pelanggan(
    id varchar(64) not null primary key,
    nama varchar(64) not null,
    alamat text
)engine= InnoDB;

insert into pelanggan(id, nama, alamat) values
('001', 'Sisca','Ciamis'),
('002', 'Lili','Cirebon');

