package com.ahmedshaban.ecomm.controller;

import com.ahmedshaban.ecomm.entities.CustomerEntity;
import com.ahmedshaban.ecomm.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;

@RestController
public class CustomersController{

    private final CustomerService customerService;

    public CustomersController(CustomerService customerService) {

        this.customerService = customerService;
    }


    @GetMapping(value = "/api/v1/customers")
    public ResponseEntity<Iterable<CustomerEntity>> getAllCustomers() {

        return ok(customerService.getAllCustomers());
    }

    @GetMapping(value = "/api/v1/customers/{id}")
    public ResponseEntity<CustomerEntity> getCustomerById(@PathVariable("id") UUID id) {

        return customerService.getCustomerById(id).map(ResponseEntity::ok).orElse(notFound().build());
    }
}
