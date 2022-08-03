package com.sn21.sinaukoding21.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author : Noverry Ambo
 * @since : 03/08/2022, Wed
 **/
@Entity
@Table(name = "users")
@Setter
@Getter
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "profile_name")
    private String profileName;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;
}
