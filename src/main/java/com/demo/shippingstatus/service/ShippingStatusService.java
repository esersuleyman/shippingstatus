package com.demo.shippingstatus.service;


import com.demo.shippingstatus.domain.ShippingStatusDTO;

public interface ShippingStatusService {

    ShippingStatusDTO getShippingStatus(Integer id);
}
