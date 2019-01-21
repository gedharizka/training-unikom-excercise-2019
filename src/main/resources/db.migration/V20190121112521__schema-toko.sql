create table toko(
    id varchar(64) not null primary key,
    nama varchar(64) not null,
    alamat text not null,
    pemilik varchar(64) not null
    )engine = InnoDB;

insert into toko (id, nama, alamat, pemilik)
values  ('991','Sepatu slop','Bandung','Gusto'),
        ('992','Gadget Gaol','Sumedang','Meo'),
        ('993','Baju Pass','Subang','Sao'),
        ('994','Grand fans','Ciamis','Amau');
