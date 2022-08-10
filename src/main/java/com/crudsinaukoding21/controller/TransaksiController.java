package com.crudsinaukoding21.controller;

import com.crudsinaukoding21.model.Transaksi;
import com.crudsinaukoding21.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Noverry Ambo
 * @since : 09/08/2022, Tue
 **/
@RestController
@RequestMapping("/api/transaksi")
public class TransaksiController {

    @Autowired
    TransaksiService service;

    @GetMapping
    public ResponseEntity<?> findAlltransaksi() {
        return new ResponseEntity(service.findAllTransaksi(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> savetransaksi(@RequestBody Transaksi transaksi) {
        return new ResponseEntity(service.createTransaksi(transaksi), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletetransaksi(@PathVariable Integer id) {
        service.deleteTransaksi(id);
        return new ResponseEntity("Berhasil dihapus", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatetransaksi(@PathVariable Integer id, @RequestBody Transaksi transaksi) {
        return new ResponseEntity(service.updateTransaksi(id, transaksi), HttpStatus.OK);
    }
}
