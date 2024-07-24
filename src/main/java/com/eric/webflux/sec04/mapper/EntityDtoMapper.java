package com.eric.webflux.sec04.mapper;

import com.eric.webflux.sec04.dto.CustomerDto;
import com.eric.webflux.sec04.entity.Customer;

public class EntityDtoMapper {

    public static Customer toEntity(CustomerDto dto) {
        return new Customer(dto.id(), dto.name(), dto.email());
    }

    public static CustomerDto toDto(Customer customer) {
        return new CustomerDto(customer.getId(), customer.getName(), customer.getEmail());
    }
}
