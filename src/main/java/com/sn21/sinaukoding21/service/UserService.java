package com.sn21.sinaukoding21.service;

import com.sn21.sinaukoding21.model.User;
import com.sn21.sinaukoding21.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 03/08/2022, Wed
 **/
@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User createUser(User user){
        return repository.save(user);
    }

    public void deleteUser(int id){
        User data = repository.findById(id).orElseThrow(null);
        repository.delete(data);
    }

    public User updateUser(int id, User user){
        User data = repository.findById(id).orElseThrow(null);
        data.setUsername(user.getUsername() != null ? user.getUsername() : data.getUsername());
        data.setAddress(user.getAddress() != null ? user.getAddress() : data.getAddress());
        data.setProfileName(user.getProfileName() != null ? user.getProfileName() : data.getProfileName());
        data.setPhone(user.getPhone() != null ? user.getPhone() : data.getPhone());

        return repository.save(data);
    }

    @Transactional
    public List<User> saveAllUser(List<User> usersList) {
        List<User> response = repository.saveAll(usersList);
        return response;
    }

}
