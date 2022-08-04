package com.sn21.sinaukoding21.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/

@Entity
@Setter
@Getter
@Table(name = "detail_user")
public class DetailUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "gender")
    private String gender;

    @Column(name = "religion")
    private String religion;

    @Transient
    @OneToOne(mappedBy = "detailUser", fetch = FetchType.LAZY)
    private User user;
}
