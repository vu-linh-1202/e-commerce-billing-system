package com.hcl.ecommercebillingsystem.dto;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class BillerInfo extends BaseInfo {

    private String billNo;

    private CustomerInfo customer;

    private double grandTotal;

    private int quantity;

    private double totalTaxAmount;

}
