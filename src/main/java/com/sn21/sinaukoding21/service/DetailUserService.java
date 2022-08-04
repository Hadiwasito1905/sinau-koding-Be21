package com.sn21.sinaukoding21.service;

import com.sn21.sinaukoding21.model.DetailUser;
import com.sn21.sinaukoding21.repository.DetailUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/
@Service
public class DetailUserService {

    @Autowired
    DetailUserRepository repository;

    public DetailUser createUser(DetailUser detailUser){
        return repository.save(detailUser);
    }

    public List<DetailUser> findAll(){
        return repository.findAll();
    }
}
