package com.company.orderplanning.dao;

import com.company.orderplanning.entity.Product;

public interface ProductDao {
    Product getById(long id);
}
