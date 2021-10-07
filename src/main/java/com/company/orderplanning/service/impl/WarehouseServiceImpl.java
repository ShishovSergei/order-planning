package com.company.orderplanning.service.impl;

import com.company.orderplanning.dao.WarehouseDao;
import com.company.orderplanning.entity.Product;
import com.company.orderplanning.entity.Warehouse;
import com.company.orderplanning.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    final WarehouseDao warehouseDao;

    @Autowired
    public WarehouseServiceImpl(WarehouseDao warehouseDao) {
        this.warehouseDao = warehouseDao;
    }

    @Override
    public List<Warehouse> containsProduct(Product product) {
        return warehouseDao.getAllContaining(product);
    }
}
