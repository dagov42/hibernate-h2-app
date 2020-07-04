package com.hibernate.h;

import javax.persistence.*;

@Entity
@Table(name = "buyers")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Buyer() {
    }

    public void print() {
        System.out.println("User id = " + id + "; name = " + name);
    }
}
