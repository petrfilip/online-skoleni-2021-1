package com.test.eshopweb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
//@Table(name = "item")
public class Item {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    private double price;

    @ManyToOne(fetch = FetchType.LAZY) // toto je best practice! (viz. Hibernate dokumentace)
    @JoinColumn(name = "category_id")
    private Category category;

}
