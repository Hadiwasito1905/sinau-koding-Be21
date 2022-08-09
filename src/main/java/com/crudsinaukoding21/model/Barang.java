package com.crudsinaukoding21.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/
@Entity
@Setter
@Getter
@Table(name = "barang")
public class Barang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nama_barang", length = 100)
    private String namaBarang;

    @Column(name = "harga", length = 30)
    private double harga;

    @Column(name = "stock")
    private int stock;

//    @Column(name = "id_supplier")
//    private int idSupplier;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_supplier")
    private Supplier supplier;
}
