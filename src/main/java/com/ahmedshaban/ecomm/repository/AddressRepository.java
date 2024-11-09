package com.ahmedshaban.ecomm.repository;

import com.ahmedshaban.ecomm.entities.AddressEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AddressRepository extends CrudRepository<AddressEntity, UUID> {
}
