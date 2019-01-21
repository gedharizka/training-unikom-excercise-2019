package com.multipolar.bootcamp.spring.appecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 create table toko(
 id varchar(64) not null primary key,
 nama varchar(64) not null,
 alamat text not null,
 pemilik varchar(64) not null
 )engine = InnoDB;
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "daftarProduk")
@Entity
@Table(name = "toko")
public class Toko {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable =false, unique = true)
    private String id;

    @Column(name = "nama", nullable = false)
    private String nama;

    @Type(type = "text")
    @Column (name = "alamat")
    private String alamat;

    @Column(name = "pemilik", nullable = false)
    private String pemilik;

    @JsonIgnore
    @OneToMany (mappedBy = "toko")
    private List<Produk>daftarProduk = new ArrayList<>();
}
