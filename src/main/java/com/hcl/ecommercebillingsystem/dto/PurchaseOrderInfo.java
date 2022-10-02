package com.hcl.ecommercebillingsystem.dto;

import com.hcl.ecommercebillingsystem.common.staticdata.PurchaseOrderStatus;
import com.hcl.ecommercebillingsystem.entity.BaseObject;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PurchaseOrderInfo extends BaseObject {

    private String productName;

    private String productDescription;

    private int quantity;

    private double unitPrice;

    private String purchaseOrderCode;

    private VendorInfo vendor;

    private TaxInfo tax;

    private double taxAmount;

    private double totalAmount;

    private CategoryInfo category;

    private double grandTotal;

    private PurchaseOrderStatus purchaseOrderStatus;

}
