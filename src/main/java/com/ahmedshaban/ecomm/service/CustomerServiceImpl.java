package com.ahmedshaban.ecomm.service;

import com.ahmedshaban.ecomm.entities.CustomerEntity;
import com.ahmedshaban.ecomm.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }


    @Override
    public Iterable<CustomerEntity> getAllCustomers() {

        return customerRepository.findAll();
    }
}
