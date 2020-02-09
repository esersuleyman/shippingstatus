package com.demo.shippingstatus.service;

import com.demo.shippingstatus.config.FeignConfig;
import com.demo.shippingstatus.domain.ShippingDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "ShippingWebService", url = "http://5e209e06e31c6e0014c60962.mockapi.io", configuration = FeignConfig.class)
public interface ShippingServiceClient {

    @RequestMapping(method = RequestMethod.GET,value="/api/shipping/${saleId}",consumes= MediaType.APPLICATION_JSON_VALUE)
    public ShippingDTO getShipping(@PathVariable Integer saleId);

}

