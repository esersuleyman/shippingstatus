package com.demo.shippingstatus.api.response;


import com.demo.shippingstatus.domain.ShippingStatusDTO;

public class ShippingStatusResponseModel {

    ShippingStatusDTO shippingStatus;

    public ShippingStatusDTO getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(ShippingStatusDTO shippingStatus) {
        this.shippingStatus = shippingStatus;
    }
}
