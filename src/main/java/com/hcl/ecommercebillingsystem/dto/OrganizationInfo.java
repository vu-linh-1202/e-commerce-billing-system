package com.hcl.ecommercebillingsystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrganizationInfo extends BaseInfo {

    private String orgCode;

    private String orgName;

    private UserInfo user;
}
