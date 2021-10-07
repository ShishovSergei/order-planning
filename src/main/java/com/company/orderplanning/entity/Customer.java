package com.company.orderplanning.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Serializable {
    private long id;
    private Location location;
    private List<Order> orders = new ArrayList<>();

    public Customer(long id, Location location) {
        this.id = id;
        this.location = location;
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

    public List<Order> getOrders() {
        return orders;
    }
}
