package com.company.orderplanning.dto;

import com.company.orderplanning.entity.Location;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class CustomerDto implements Serializable {
    @JsonProperty
    private double latitude;
    @JsonProperty
    private double longitude;
    @JsonProperty
    private double elevation;

    public Location getLocation() {
        return new Location(latitude, longitude, elevation);
    }
}
