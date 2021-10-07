package com.company.orderplanning.dao;

import com.company.orderplanning.entity.Product;
import com.company.orderplanning.entity.Warehouse;

import java.util.List;

public interface WarehouseDao {
    List<Warehouse> getAllContaining(Product product);
}
