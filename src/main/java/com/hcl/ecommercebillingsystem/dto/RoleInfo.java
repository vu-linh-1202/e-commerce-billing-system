package com.hcl.ecommercebillingsystem.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoleInfo extends BaseInfo {

    private String name;

    private String description;
}
