package com.crudsinaukoding21.repository;

import com.crudsinaukoding21.model.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/
public interface TransaksiRepo extends JpaRepository<Transaksi, Integer> {
}
