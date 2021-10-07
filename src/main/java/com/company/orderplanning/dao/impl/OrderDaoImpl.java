package com.company.orderplanning.dao.impl;

import com.company.orderplanning.dao.OrderDao;
import com.company.orderplanning.dto.OrderDto;
import com.company.orderplanning.entity.Customer;
import com.company.orderplanning.entity.Order;
import com.company.orderplanning.service.CustomerService;
import com.company.orderplanning.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao {

    final CustomerService customerService;
    final ProductService productService;

    private final List<Order> orders = new ArrayList<>();

    @Autowired
    public OrderDaoImpl(CustomerService customerService, ProductService productService) {
        this.customerService = customerService;
        this.productService = productService;
    }

    @Override
    public Order save(OrderDto orderDto) {
        if(orderDto == null)
            return null;
        Order order = new Order(orders.size() + 1,
                productService.getById(orderDto.getProductId()), customerService.getById(orderDto.getCustomerId()));
        orders.add(order);
        Customer customer = customerService.getById(orderDto.getCustomerId());
        customer.getOrders().add(order);
        return order;
    }

    @Override
    public Order getById(long id) {
        return orders.stream().filter(order -> order.getId() == id).findFirst().orElse(null);
    }
}
