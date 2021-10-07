package com.company.orderplanning.service;

import com.company.orderplanning.entity.Product;
import com.company.orderplanning.entity.Warehouse;

import java.util.List;

public interface WarehouseService {
    List<Warehouse> containsProduct(Product product);
}
