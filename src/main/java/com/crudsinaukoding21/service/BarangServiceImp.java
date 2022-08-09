package com.crudsinaukoding21.service;

import com.crudsinaukoding21.model.Barang;
import com.crudsinaukoding21.repository.BarangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/
@Service
@Transactional
public class BarangServiceImp implements BarangService {

    @Autowired
    BarangRepo repository;

    @Override
    public Barang createData(Barang barang) {
        return repository.save(barang) ;
    }

    @Override
    public Barang findOne(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public Barang updateBarang(Barang barang, Integer id) {
        Barang reference = repository.findById(id).get();
        reference.setNamaBarang(barang.getNamaBarang() != null ? barang.getNamaBarang():reference.getNamaBarang());
        reference.setHarga(barang.getHarga() != 0 ? barang.getHarga():reference.getHarga());
        reference.setStock(barang.getStock() != 0 ? barang.getStock():reference.getStock());
        reference.setSupplier(barang.getSupplier() != null ? barang.getSupplier():reference.getSupplier());
        return repository.save(reference);
    }

    @Override
    public List<Barang> getAllBarang() {
        return repository.findAll();
    }

    @Override
    public List<Barang> findBarangByName(String nama) {
        return repository.findByNamaBarangContaining(nama);
    }

    @Override
    public List<Barang> saveAlldata(List<Barang> list) {
        List<Barang> response = repository.saveAll(list);
        return response;
    }

    @Override
    public void removeOne(Integer id) {
        repository.deleteById(id);
    }
}
