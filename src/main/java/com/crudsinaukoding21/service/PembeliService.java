package com.crudsinaukoding21.service;

import com.crudsinaukoding21.model.Pembeli;

import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 09/08/2022, Tue
 **/
public interface PembeliService {
    List<Pembeli> findAllPembeli();

    Pembeli createPembeli(Pembeli param);

    Pembeli updatePembeli(int id, Pembeli pembeli);

    void deletePembeli(int id);
}
