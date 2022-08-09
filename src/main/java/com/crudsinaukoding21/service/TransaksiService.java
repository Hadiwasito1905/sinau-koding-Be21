package com.crudsinaukoding21.service;

import com.crudsinaukoding21.model.Supplier;
import com.crudsinaukoding21.model.Transaksi;

import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 09/08/2022, Tue
 **/
public interface TransaksiService {

    List<Transaksi> findAllTransaksi();

    Transaksi createTransaksi(Transaksi param);

    Transaksi updateTransaksi(int id, Transaksi param);

    void deleteTransaksi(int id);
}
