package com.crudsinaukoding21.service;

import com.crudsinaukoding21.model.Pembeli;
import com.crudsinaukoding21.repository.PembeliRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 09/08/2022, Tue
 **/
@Service
@Transactional
public class PembeliServiceImp implements PembeliService {

   @Autowired
    PembeliRepo repository;


    @Override
    public List<Pembeli> findAllPembeli() {
        return repository.findAll();
    }

    @Override
    public Pembeli createPembeli(Pembeli param) {
        return repository.save(param);
    }

    @Override
    public Pembeli updatePembeli(int id, Pembeli pembeli) {
        Pembeli data = repository.findById(id).orElseThrow(null);
        data.setNamaPembeli(pembeli.getNamaPembeli() != null ? pembeli.getNamaPembeli() : data.getNamaPembeli());
        data.setNoTlp(pembeli.getNoTlp() != null ? pembeli.getNoTlp() : data.getNoTlp());
        data.setAlamat(pembeli.getAlamat() != null ? pembeli.getAlamat() : data.getAlamat());

        return repository.save(data);
    }

    @Override
    public void deletePembeli(int id) {
        Pembeli data = repository.findById(id).orElseThrow(null);
        repository.delete(data);
    }
}
