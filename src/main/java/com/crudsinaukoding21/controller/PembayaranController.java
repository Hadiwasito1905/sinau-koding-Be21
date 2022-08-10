package com.crudsinaukoding21.controller;

import com.crudsinaukoding21.model.Pembayaran;
import com.crudsinaukoding21.service.PembayaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Noverry Ambo
 * @since : 09/08/2022, Tue
 **/
@RestController
@RequestMapping("/api/pembayaran")
public class PembayaranController {

    @Autowired
    PembayaranService service;

    @GetMapping
    public ResponseEntity<?> findAllPembayaran(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> savepembayaran(@RequestBody Pembayaran pembayaran){
        return new ResponseEntity<>(service.createData(pembayaran), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletepembayaran(@PathVariable Integer id){
        service.deleteById(id);
        return new ResponseEntity<>("Data berhasil dihabpus", HttpStatus.OK);
    }





}
