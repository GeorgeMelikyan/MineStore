package com.adventures.MineStore.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private ProductTypes productTypes;

    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    private int price;
    private int weight;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "product")
    private List<Purchase> purchase;

    public Product() {
    }

    public Product(ProductTypes productTypes, String name, String description, int price, int weight) {
        this.productTypes = productTypes;
        this.name = name;
        this.description = description;
        this.price = price;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductTypes getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(ProductTypes productTypes) {
        this.productTypes = productTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
