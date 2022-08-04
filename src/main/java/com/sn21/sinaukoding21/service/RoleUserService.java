package com.sn21.sinaukoding21.service;

import com.sn21.sinaukoding21.model.RoleUser;
import com.sn21.sinaukoding21.repository.RoleUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/
@Service
public class RoleUserService {

    @Autowired
    RoleUserRepository roleUserRepository;

    public RoleUser create(RoleUser param){
        return roleUserRepository.save(param);
    }

    public List<RoleUser> listRole(){
        return roleUserRepository.findAll();
    }
}
