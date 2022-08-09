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
@Table(name = "pembayaran")
public class Pembayaran {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tgl_bayar")
    private Date tglBayar;

    @Column(name = "total")
    private double total;

    @OneToOne
    @JoinColumn(name = "id_transaksi")
    private Transaksi idTransaksi;
}
