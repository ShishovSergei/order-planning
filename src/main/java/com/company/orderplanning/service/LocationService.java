package com.company.orderplanning.service;

import com.company.orderplanning.entity.Location;

public interface LocationService {
    double distance(Location firstLocation, Location secondLocation);
}
