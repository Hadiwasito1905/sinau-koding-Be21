package com.sn21.sinaukoding21.controller;

import com.sn21.sinaukoding21.model.DetailUser;
import com.sn21.sinaukoding21.service.DetailUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/
@RestController
@RequestMapping("/detail-user")
public class DetailUserController {

    @Autowired
    private DetailUserService service;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody DetailUser param){
        return new ResponseEntity<>(service.createUser(param), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> listDetail(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

}
