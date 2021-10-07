package com.company.orderplanning.dao.impl;

import com.company.orderplanning.dao.ProductDao;
import com.company.orderplanning.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Repository
public class ProductDaoImpl implements ProductDao {

    private final Set<Product> products = new HashSet<>(Arrays.asList(new Product(1, "bicycle", "very slow"),
            new Product(2, "motorcycle", "super fast"),
            new Product(3, "car", "super fast"),
            new Product(4, "boat", "very fast"),
            new Product(5, "tank", "heavy"),
            new Product(6, "scooter", "slow"),
            new Product(7, "skateboard", "super slow"),
            new Product(8, "electric car", "smart")));

    @Override
    public Product getById(long id) {
        return products.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }
}
