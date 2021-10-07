package com.company.orderplanning.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class OrderDto implements Serializable {
    @JsonProperty
    private long customerId;
    @JsonProperty
    private long productId;

    public OrderDto(long customerId, long productId) {
        this.customerId = customerId;
        this.productId = productId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

}
