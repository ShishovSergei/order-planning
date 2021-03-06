package com.company.orderplanning.entity;

import java.io.Serializable;

public class Order implements Serializable {
    private long id;
    private Product product;
    private Customer customer;

    public Order(long id, Product product, Customer customer) {
        this.id = id;
        this.product = product;
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
