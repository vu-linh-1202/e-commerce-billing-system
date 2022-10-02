package com.hcl.ecommercebillingsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hcl.ecommercebillingsystem.common.staticdata.StockStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "product_item")
public class ProductItem extends BaseObject{

    @Column(name = "product_item_code", nullable = false)
    private String productItemCode;

    @JsonBackReference
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "status",nullable = false)
    private StockStatus stockStatus;
}
