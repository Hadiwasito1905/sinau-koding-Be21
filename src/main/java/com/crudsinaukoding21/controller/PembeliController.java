package com.crudsinaukoding21.controller;

import com.crudsinaukoding21.model.Pembeli;
import com.crudsinaukoding21.service.PembeliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Noverry Ambo
 * @since : 09/08/2022, Tue
 **/

@RestController
@RequestMapping("/api/pembeli")
public class PembeliController {

    @Autowired
    PembeliService service;

    @GetMapping
    public ResponseEntity<?> findAllPembeli(){
        return new ResponseEntity<>(service.findAllPembeli(), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> deletepembeli(@PathVariable Integer id) {
        service.deletePembeli(id);
        return new ResponseEntity("Berhasil dihapus", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatepembeli(@PathVariable Integer id, @RequestBody Pembeli pembeli) {
        return new ResponseEntity(service.updatePembeli(id, pembeli), HttpStatus.OK);
    }

}
