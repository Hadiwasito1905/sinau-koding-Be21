package com.crudsinaukoding21.service;

import com.crudsinaukoding21.model.Barang;

import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/

public interface BarangService {

    Barang createData(Barang barang);

    Barang findOne(Integer id);

    Barang updateBarang(Barang barang, Integer id);

    List<Barang> getAllBarang();

    List<Barang> findBarangByName(String nama);

    List<Barang> saveAlldata(List<Barang> list);

    void removeOne(Integer id);
}
