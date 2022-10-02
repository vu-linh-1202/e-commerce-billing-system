package com.hcl.ecommercebillingsystem.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeInfo extends BaseInfo {

    private String fullName;

    private String employeeCode;

    private UserInfo user;
}
