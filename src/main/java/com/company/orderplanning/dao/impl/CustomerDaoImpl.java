package com.company.orderplanning.dao.impl;

import com.company.orderplanning.dao.CustomerDao;
import com.company.orderplanning.dto.CustomerDto;
import com.company.orderplanning.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    private final Set<Customer> customers = new HashSet<>();

    @Override
    public Customer save(CustomerDto customerDto) {
        if (customerDto == null)
            return null;
        Customer customer = new Customer(customers.size() + 1, customerDto.getLocation());
        customers.add(customer);
        return customer;
    }

    @Override
    public Customer getById(long id) {
        return customers.stream().filter(customer -> customer.getId() == id).findFirst().orElse(null);
    }
}
