package com.company.orderplanning.dao;

import com.company.orderplanning.dto.OrderDto;
import com.company.orderplanning.entity.Order;

public interface OrderDao {
    Order save(OrderDto orderDto);

    Order getById(long id);
}
