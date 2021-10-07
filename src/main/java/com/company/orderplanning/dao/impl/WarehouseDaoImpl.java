package com.company.orderplanning.dao.impl;

import com.company.orderplanning.dao.WarehouseDao;
import com.company.orderplanning.entity.Location;
import com.company.orderplanning.entity.Product;
import com.company.orderplanning.entity.Warehouse;
import com.company.orderplanning.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class WarehouseDaoImpl implements WarehouseDao {

    ProductService productService;

    @Autowired
    public WarehouseDaoImpl(ProductService productService) {
        this.productService = productService;
    }


    private final List<Warehouse> warehouses = new ArrayList<>(Arrays.asList(
            new Warehouse(1, new Location(53.5359, 27.3400, 222), Arrays.asList(new Product(1, "bicycle", "very slow"),
                    new Product(2, "motorcycle", "super fast"),
                    new Product(3, "car", "super fast"),
                    new Product(4, "boat", "very fast"),
                    new Product(5, "tank", "heavy"),
                    new Product(6, "scooter", "slow"),
                    new Product(7, "skateboard", "super slow"),
                    new Product(8, "electric car", "smart"))),
            new Warehouse(2, new Location(52.2298, 21.118, 113), Arrays.asList(new Product(1, "bicycle", "very slow"),
                    new Product(2, "motorcycle", "super fast"),
                    new Product(3, "car", "super fast"),
                    new Product(4, "boat", "very fast"), new Product(5, "tank", "heavy"),
                    new Product(6, "scooter", "slow"),
                    new Product(7, "skateboard", "super slow"),
                    new Product(8, "electric car", "smart")))));


    @Override
    public List<Warehouse> getAllContaining(Product product) {
        if (product == null)
            return Collections.emptyList();
        return warehouses.stream().filter(warehouse -> warehouse.getProducts().contains(product)).collect(Collectors.toList());
    }
}
