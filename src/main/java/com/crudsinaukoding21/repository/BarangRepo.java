package com.crudsinaukoding21.repository;

import com.crudsinaukoding21.model.Barang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/
public interface BarangRepo extends JpaRepository<Barang, Integer> {

    public List<Barang> findByNamaBarangContaining(String nama);
}
