package com.hcl.ecommercebillingsystem.dto;

import com.hcl.ecommercebillingsystem.common.staticdata.StockStatus;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductItemInfo extends BaseInfo {

    private String productItemCode;

    private ProductInfo productInfo;

    private StockStatus stockStatus;

}
