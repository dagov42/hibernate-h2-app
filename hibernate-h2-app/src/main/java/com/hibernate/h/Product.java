package com.hibernate.h;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Long price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Product() {
    }

    public void print() {
        System.out.println("Product id = " + id + "; name = " + name + "; price = " + price);
    }

    @ManyToMany
    @JoinTable(
            name = "products_categories",
            joinColumns = @JoinColumn(name = "products_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;

}
