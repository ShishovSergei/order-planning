package com.company.orderplanning.service.impl;

import com.company.orderplanning.dao.OrderDao;
import com.company.orderplanning.dto.OrderDto;
import com.company.orderplanning.entity.Order;
import com.company.orderplanning.entity.Warehouse;
import com.company.orderplanning.service.CustomerService;
import com.company.orderplanning.service.LocationService;
import com.company.orderplanning.service.OrderService;
import com.company.orderplanning.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    final OrderDao orderDao;
    final WarehouseService warehouseService;
    final LocationService locationService;
    final CustomerService customerService;

    @Autowired
    public OrderServiceImpl(OrderDao orderDao, WarehouseService warehouseService, LocationService locationService, CustomerService customerService) {
        this.orderDao = orderDao;
        this.warehouseService = warehouseService;
        this.locationService = locationService;
        this.customerService = customerService;
    }

    @Override
    public Warehouse nearestWarehouse(Order order) {
        if (order == null)
            return null;
        Order currentOrder = orderDao.getById(order.getId());
        List<Warehouse> warehousesWithProduct = warehouseService.containsProduct(currentOrder.getProduct());

        Warehouse nearestWarehouse = null;
        double minDistance = Double.MAX_VALUE;
        for (Warehouse warehouse : warehousesWithProduct) {
            double distance = locationService.distance(warehouse.getLocation(), order.getCustomer().getLocation());
            if (distance < minDistance) {
                nearestWarehouse = warehouse;
                minDistance = distance;
            }

        }
        return nearestWarehouse;
    }

    @Override
    public Order save(OrderDto orderDto) {
        if (orderDto == null)
            return null;
        return orderDao.save(orderDto);
    }
}
