package com.crudsinaukoding21.model.dto;


import lombok.Getter;
import lombok.Setter;

/**
 * @author : Noverry Ambo
 * @since : 09/08/2022, Tue
 **/
@Setter
@Getter
public class BarangDto {
        private Integer id;
        private String namaBarang;
        private Double harga;
        private Integer stok;
        private Integer idSupplier;
}
