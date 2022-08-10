package com.crudsinaukoding21.service;

import com.crudsinaukoding21.model.Supplier;
import com.crudsinaukoding21.repository.SupplierRepo;
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
public class SupplierServiceImp implements SupplierService{

    @Autowired
    SupplierRepo repository;


    @Override
    public List<Supplier> findAllSupplier() {
        return repository.findAll();
    }

    @Override
    public Supplier createSupplier(Supplier param) {
        return repository.save(param);
    }

    @Override
    public Supplier updateSupplier(int id, Supplier param) {
        Supplier data = repository.findById(id).orElseThrow(null);
        data.setNamaSupplier(param.getNamaSupplier() != null ? param.getNamaSupplier() : data.getNamaSupplier());
        data.setAlamat(param.getAlamat() != null ? param.getNamaSupplier() : data.getAlamat());
        data.setNoTlp(param.getNoTlp() != null ? param.getNoTlp() : data.getNoTlp());

        return repository.save(data);
    }

    @Override
    public void deleteSupplier(int id) {
        repository.deleteById(id);
    }
}
