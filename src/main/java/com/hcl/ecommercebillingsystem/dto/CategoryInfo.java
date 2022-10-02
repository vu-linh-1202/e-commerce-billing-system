package com.hcl.ecommercebillingsystem.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;


@Getter
@Setter
public class CategoryInfo extends BaseInfo {


    private String categoryCode;
    @NotEmpty(message = "Category name can't be empty")
    private String name;

    @NotEmpty(message = "Category Description can't be empty")
    private String description;
}
