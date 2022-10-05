package com.hcl.ecommercebillingsystem.mapper;

import com.hcl.ecommercebillingsystem.dto.EmployeeInfo;
import com.hcl.ecommercebillingsystem.entity.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    Employee employeeInfoToEmployee(EmployeeInfo employeeInfo);

    @InheritInverseConfiguration
    EmployeeInfo employeeToEmployeeInfo(Employee employee);
}
