package com.company.orderplanning.service.impl;

import com.company.orderplanning.entity.Location;
import com.company.orderplanning.service.LocationService;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {


    @Override
    public double distance(Location firstLocation, Location secondLocation) {

        final int R = 6371;

        double latDistance = Math.toRadians(secondLocation.getLatitude() - firstLocation.getLatitude());
        double lonDistance = Math.toRadians(secondLocation.getLongitude() - firstLocation.getLongitude());
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(firstLocation.getLatitude())) * Math.cos(Math.toRadians(secondLocation.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000;

        double height = firstLocation.getElevation() - secondLocation.getElevation();

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);

    }
}
