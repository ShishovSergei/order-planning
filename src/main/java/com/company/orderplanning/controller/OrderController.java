package com.company.orderplanning.controller;

import com.company.orderplanning.dto.OrderDto;
import com.company.orderplanning.entity.Order;
import com.company.orderplanning.entity.Warehouse;
import com.company.orderplanning.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/orders")
    public ResponseEntity<Warehouse> newOrder(@RequestBody OrderDto order) {
        Order newOrder = orderService.save(order);
        Warehouse nearestWarehouse = orderService.nearestWarehouse(newOrder);
        return ResponseEntity.ok().body(nearestWarehouse);
    }
}
