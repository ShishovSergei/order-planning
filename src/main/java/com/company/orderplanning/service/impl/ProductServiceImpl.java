package com.company.orderplanning.service.impl;

import com.company.orderplanning.dao.ProductDao;
import com.company.orderplanning.entity.Product;
import com.company.orderplanning.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    final ProductDao productDao;

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product getById(long id) {
        return productDao.getById(id);
    }
}
