package com.company.orderplanning.service;

import com.company.orderplanning.dto.CustomerDto;
import com.company.orderplanning.entity.Customer;

public interface CustomerService {
    Customer save(CustomerDto customer);
    Customer getById(long id);
}
