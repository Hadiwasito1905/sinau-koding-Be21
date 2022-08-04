package com.sn21.sinaukoding21.controller;

import com.sn21.sinaukoding21.model.RoleUser;
import com.sn21.sinaukoding21.service.RoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/
@RestController
@RequestMapping("/role")
public class RoleUserController {

    @Autowired
    RoleUserService roleUserService;

    @PostMapping
    public ResponseEntity<?> createRoleUser(@RequestBody RoleUser param){
        return new ResponseEntity<>(roleUserService.create(param), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> listRole(){
        return new ResponseEntity<>(roleUserService.listRole(), HttpStatus.OK);
    }
}
