package com.company.orderplanning.controller;

import com.company.orderplanning.dto.CustomerDto;
import com.company.orderplanning.entity.Customer;
import com.company.orderplanning.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/customers")
    public ResponseEntity<Customer> newCustomer(@RequestBody CustomerDto newCustomer){
        Customer savedCustomer = customerService.save(newCustomer);
        return ResponseEntity.ok().body(savedCustomer);
    }
}
