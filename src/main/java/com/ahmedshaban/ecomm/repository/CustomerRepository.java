package com.ahmedshaban.ecomm.repository;

import com.ahmedshaban.ecomm.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerRepository extends CrudRepository<CustomerEntity, UUID> {
}
