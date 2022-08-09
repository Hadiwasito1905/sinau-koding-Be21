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
@Table(name = "supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nama_supplier", length = 100)
    private String namaSupplier;

    @Column(name = "no_tlp", length = 20)
    private String noTlp;

    @Column(name = "alamat", length = 255)
    private String alamat;
}
