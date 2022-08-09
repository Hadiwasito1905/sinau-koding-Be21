package com.crudsinaukoding21.controller;

import com.crudsinaukoding21.model.Barang;
import com.crudsinaukoding21.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Barang> getAll(){
        return service.getAllBarang();
    }

    @PostMapping("/update")
    public Barang update(@RequestBody Barang barang, Integer id){
        return service.updateBarang(barang, id);
    }

    @GetMapping("/getone/{id}")
    public Barang findOne(@PathVariable("id") Integer id){
        return service.findOne(id);
    }

    @DeleteMapping("/delete/{id}")
    public void removeOne(@PathVariable("id") Integer id){
        service.removeOne(id);
    }

    @GetMapping("/getnama/{nama}")
    public List<Barang> findByNama(@PathVariable("nama") String nama){
        return service.findBarangByName(nama);
    }




}
