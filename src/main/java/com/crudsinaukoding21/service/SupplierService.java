package com.crudsinaukoding21.service;

import com.crudsinaukoding21.model.Pembeli;
import com.crudsinaukoding21.model.Supplier;

import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 09/08/2022, Tue
 **/
public interface SupplierService {

    List<Supplier> findAllSupplier();

    Supplier createSupplier(Supplier param);

    Supplier updateSupplier(int id, Supplier param);

    void deleteSupplier(int id);
}
