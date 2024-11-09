package com.ahmedshaban.ecomm.repository;

import com.ahmedshaban.ecomm.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomersRepository extends CrudRepository<UserEntity, UUID> {
}
