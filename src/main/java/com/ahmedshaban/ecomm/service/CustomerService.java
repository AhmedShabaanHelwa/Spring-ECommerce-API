package com.ahmedshaban.ecomm.service;

import com.ahmedshaban.ecomm.entities.AddressEntity;
import com.ahmedshaban.ecomm.entities.CustomerEntity;

import java.util.Optional;
import java.util.UUID;

public interface CustomerService {

    Iterable<CustomerEntity> getAllCustomers();

    Optional<CustomerEntity> getCustomerById(UUID id);

    void deleteCustomerById(String id);

    void deleteCustomer(CustomerEntity customerEntity);

    Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id);

}
