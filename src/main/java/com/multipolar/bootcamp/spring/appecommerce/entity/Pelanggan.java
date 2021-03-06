package com.multipolar.bootcamp.spring.appecommerce.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**create table pelanggan(
 id varchar(64) not null primary key,
 nama varchar(64) not null,
 alamat text
 )engine= InnoDB;**/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Pelanggan {
    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "nama", nullable = false)
    private String nama;

    @Type(type = "text")
    @Column(name = "alamat")
    private String alamat;
}
