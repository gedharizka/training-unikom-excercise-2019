package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

/**create table produk(
 id varchar(64) not null primary key,
 toko_id varchar(64)not null,
 nama varchar (64) not null,
 harga int not null,
 tanggal timestamp not null
 )engine = InnoDB;**/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "produk")
public class Produk {

    @Id
    @GenericGenerator(name = "uuid_gen",strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "nama", nullable = false)
    private String nama;

    @Column(name = "harga", nullable = false)
    private Integer harga;

    @Type(type = "timestamp")
    @Column(name = "tanggal_tambah", nullable = false)
    private String tanggal;

    @OneToOne
    @JoinColumn(name = "toko_id", nullable = false)
    private Toko toko;
}
