package com.company.orderplanning.entity;

import java.io.Serializable;
import java.util.List;

public class Warehouse implements Serializable {
    private long id;
    private Location location;
    List<Product> products;

    public Warehouse(long id, Location location, List<Product> products) {
        this.id = id;
        this.location = location;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Product> getProducts() {
        return products;
    }
}
