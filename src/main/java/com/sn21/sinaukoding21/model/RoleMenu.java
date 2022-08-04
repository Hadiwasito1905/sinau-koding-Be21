package com.sn21.sinaukoding21.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;

/**
 * @author : Noverry Ambo
 * @since : 04/08/2022, Thu
 **/

@Entity
@Table(name = "role_menu_2")
@Getter
@Setter
public class RoleMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private RoleUser roleUser;

}
