package com.crudsinaukoding21.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/
@Entity
@Setter
@Getter
@Table(name = "transaksi")
public class Transaksi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_barang")
    private Barang barang;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private Pembayaran pembayaran;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_pembeli")
    private Pembeli pembeli;

    @Column(name = "tgl_transaksi")
    private Date tglTransaksi;

    @Column(name = "keterangan", length = 255)
    private String keterangan;



}
