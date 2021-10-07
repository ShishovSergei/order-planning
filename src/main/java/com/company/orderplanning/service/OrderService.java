package com.company.orderplanning.service;

import com.company.orderplanning.dto.OrderDto;
import com.company.orderplanning.entity.Order;
import com.company.orderplanning.entity.Warehouse;

public interface OrderService {
    Warehouse nearestWarehouse(Order order);
    Order save(OrderDto orderDto);
}
