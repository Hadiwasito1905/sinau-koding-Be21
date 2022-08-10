package com.crudsinaukoding21.controller;

import com.crudsinaukoding21.model.Barang;
import com.crudsinaukoding21.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/
@RestController
@RequestMapping("/api/barang")
public class BarangController {


    @Autowired
    BarangService service;

    @PostMapping("/save")
    public ResponseEntity<Barang> createBarang(@RequestBody Barang barang){
        return ResponseEntity.ok().body(service.createData(barang));
    }

    @PostMapping("/saveall")
    public ResponseEntity<?> saveAllBarang(@RequestBody List<Barang> barangs){
        return ResponseEntity.ok().body(service.saveAlldata(barangs));
    }

    @GetMapping("/getall")
    public ResponseEntity<?> findAllbarang(){
        return new ResponseEntity<>(service.getAllBarang(), HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody Barang barang, @PathVariable Integer id){
        return new ResponseEntity<>(service.updateBarang(barang, id), HttpStatus.OK);
    }

    @GetMapping("/getone/{id}")
    public Barang findOne(@PathVariable("id") Integer id){
        return service.findOne(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> removeOne(@PathVariable("id") Integer id){
        service.removeOne(id);
        return new ResponseEntity<>("Data berhasil dihapus", HttpStatus.OK);
    }

    @GetMapping("/getnama/{nama}")
    public List<Barang> findByNama(@PathVariable("nama") String nama){
        return service.findBarangByName(nama);
    }




}
