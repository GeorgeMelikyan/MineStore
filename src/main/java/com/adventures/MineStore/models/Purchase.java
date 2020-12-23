package com.adventures.MineStore.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Product product;

    private String player;
    private Long amount;

    @Column(name="purchase_time", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date time;
    private boolean gived;

    public Purchase() {
    }

    public Purchase(Product product, String player, Long amount, Date time, boolean gived) {
        this.product = product;
        this.player = player;
        this.amount = amount;
        this.time = time;
        this.gived = gived;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public boolean isGived() {
        return gived;
    }

    public void setGived(boolean gived) {
        this.gived = gived;
    }
}
