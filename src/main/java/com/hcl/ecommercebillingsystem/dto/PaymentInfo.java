package com.hcl.ecommercebillingsystem.dto;

import com.hcl.ecommercebillingsystem.entity.BaseObject;
import com.hcl.ecommercebillingsystem.entity.Tax;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentInfo extends BaseObject {

    private BillerInfo biller;

    private ProductItemInfo productItem;

    private Tax tax;

    private double price;

    private double totalPrice;

    private double taxAmount;

    private long productId;

}
