package com.crudsinaukoding21.repository;

import com.crudsinaukoding21.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/
public interface SupplierRepo extends JpaRepository<Supplier, Integer> {
}
