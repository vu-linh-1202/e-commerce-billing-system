package com.hcl.ecommercebillingsystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerInfo extends BaseInfo {

    private String fullName;

    private String customerCode;

    private UserInfo user;
}
