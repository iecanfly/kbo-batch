package com.iecanfly.kbo.model;

import javax.persistence.*;

import javax.persistence.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: iecanfly
 * Date: 8/3/13
 * Time: 11:58 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "player")
public class Player {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private Long id;

    @Column(name = "name",nullable = false, length = 100)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
