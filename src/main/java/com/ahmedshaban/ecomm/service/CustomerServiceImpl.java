package com.ahmedshaban.ecomm.service;

import com.ahmedshaban.ecomm.entities.AddressEntity;
import com.ahmedshaban.ecomm.entities.CustomerEntity;
import com.ahmedshaban.ecomm.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

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

    @Override
    public Optional<CustomerEntity> getCustomerById(UUID id) {

        return customerRepository.findById(id);
    }

    @Override
    public void deleteCustomerById(String id) {

        customerRepository.deleteById(UUID.fromString(id));
    }

    @Override
    public void deleteCustomer(CustomerEntity customerEntity) {

        customerRepository.delete(customerEntity);
    }

    @Override
    public Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id) {

        return customerRepository.findById(UUID.fromString(id)).map(CustomerEntity::getAddresses);
    }

}
