package com.adventures.MineStore.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProductTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    private String command;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "productTypes")
    private List<Product> product;


    public ProductTypes() {
    }

    public ProductTypes(String name, String description, String command, List<Product> product) {
        this.name = name;
        this.description = description;
        this.command = command;
        this.product = product;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
