package com.crudsinaukoding21.service;

import com.crudsinaukoding21.model.Pembayaran;
import com.crudsinaukoding21.repository.PembayaranRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 05/08/2022, Fri
 **/
@Service
@Transactional
public class PembayaranServiceImp implements PembayaranService {

    @Autowired
    PembayaranRepo repository;

    @Override
    public Pembayaran createData(Pembayaran pembayaran) {
        return repository.save(pembayaran);
    }

    @Override
    public List<Pembayaran> getAll() {
        return repository.findAll();
    }
}
