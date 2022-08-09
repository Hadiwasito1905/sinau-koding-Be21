package com.crudsinaukoding21.service;

import com.crudsinaukoding21.model.Transaksi;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 09/08/2022, Tue
 **/
@Service
@Transactional
public class TransaksiServiceImp implements TransaksiService {
    @Override
    public List<Transaksi> findAllTransaksi() {
        return null;
    }

    @Override
    public Transaksi createTransaksi(Transaksi param) {
        return null;
    }

    @Override
    public Transaksi updateTransaksi(int id, Transaksi param) {
        return null;
    }

    @Override
    public void deleteTransaksi(int id) {

    }
}
