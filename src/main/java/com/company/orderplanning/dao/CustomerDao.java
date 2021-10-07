package com.company.orderplanning.dao;

import com.company.orderplanning.dto.CustomerDto;
import com.company.orderplanning.entity.Customer;

public interface CustomerDao {
    Customer save(CustomerDto customerDto);

    Customer getById(long id);
}
