package com.crudsinaukoding21.controller;

import com.crudsinaukoding21.model.Supplier;
import com.crudsinaukoding21.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Noverry Ambo
 * @since : 09/08/2022, Tue
 **/
@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    SupplierService service;

    @GetMapping
    public ResponseEntity<?> findAllsupplier() {
        return new ResponseEntity(service.findAllSupplier(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> savesupplier(@RequestBody Supplier supplier) {
        return new ResponseEntity(service.createSupplier(supplier), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletesupplier(@PathVariable Integer id) {
        service.deleteSupplier(id);
        return new ResponseEntity("Berhasil dihapus", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatesupplier(@PathVariable Integer id, @RequestBody Supplier supplier) {
        return new ResponseEntity(service.updateSupplier(id, supplier), HttpStatus.OK);
    }
}
