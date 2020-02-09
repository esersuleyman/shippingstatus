package com.demo.shippingstatus.api.controller;

import com.demo.shippingstatus.api.response.ShippingStatusResponseModel;
import com.demo.shippingstatus.service.ShippingStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sale/{id}/shipping")
public class ShippingStatusController {

    @Autowired
    private ShippingStatusService shippingStatusService;

    @GetMapping(
            produces = {
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE,
            })
    public ShippingStatusResponseModel shippingStatus(@PathVariable Integer id) {
        ShippingStatusResponseModel shippingStatusResponseModel = new ShippingStatusResponseModel();

        shippingStatusResponseModel.setShippingStatus(shippingStatusService.getShippingStatus(id));

        return shippingStatusResponseModel;
    }
}
