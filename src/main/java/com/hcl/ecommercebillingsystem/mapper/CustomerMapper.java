package com.hcl.ecommercebillingsystem.mapper;

import com.hcl.ecommercebillingsystem.dto.CustomerInfo;
import com.hcl.ecommercebillingsystem.entity.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface CustomerMapper {
    CustomerMapper INSTANCE= Mappers.getMapper(CustomerMapper.class);

    Customer customerInfoToCustomer(CustomerInfo customerInfo);

    @InheritInverseConfiguration
    CustomerInfo customerToCustomerInfo(Customer customer);
}
