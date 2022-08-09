package com.crudsinaukoding21.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/

@Entity
@Setter
@Getter
@Table(name = "pembeli")
public class Pembeli {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nama_pembeli", length = 100)
    private String namaPembeli;

    @Column(name = "no_telp", length = 20)
    private String noTlp;

    @Column(name = "alamat", length = 255)
    private String alamat;
}
