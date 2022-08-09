package com.crudsinaukoding21.service;

import com.crudsinaukoding21.model.Pembayaran;

import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 05/08/2022, Fri
 **/
public interface PembayaranService {

    Pembayaran createData(Pembayaran pembayaran);
    List<Pembayaran> getAll();

}
