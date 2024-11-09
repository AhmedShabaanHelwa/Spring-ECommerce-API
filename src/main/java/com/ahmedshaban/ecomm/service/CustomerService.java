package com.ahmedshaban.ecomm.service;

import com.ahmedshaban.ecomm.entities.CustomerEntity;

public interface CustomerService {

    Iterable<CustomerEntity> getAllCustomers();
}
