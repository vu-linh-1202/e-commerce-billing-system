package com.hcl.ecommercebillingsystem.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Setter
@Getter
public class OfferInfo extends BaseInfo {

    private String offerCode;

    @NotEmpty(message = "Offer name can't be empty")
    private String offerName;

    @NotEmpty(message = "Offer Description can't be empty")
    private String offerDescription;

    private String status;
}
