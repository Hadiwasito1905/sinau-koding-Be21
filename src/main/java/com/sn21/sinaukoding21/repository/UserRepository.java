package com.sn21.sinaukoding21.repository;

import com.sn21.sinaukoding21.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Noverry Ambo
 * @since : 03/08/2022, Wed
 **/
public interface UserRepository extends JpaRepository<User, Integer> {
}
