package com.company.orderplanning.service.impl;

import com.company.orderplanning.dao.CustomerDao;
import com.company.orderplanning.dto.CustomerDto;
import com.company.orderplanning.entity.Customer;
import com.company.orderplanning.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    final CustomerDao customerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer save(CustomerDto customer) {
        if (customer == null)
            return null;
        return customerDao.save(customer);
    }

    @Override
    public Customer getById(long id) {
        return customerDao.getById(id);
    }
}
