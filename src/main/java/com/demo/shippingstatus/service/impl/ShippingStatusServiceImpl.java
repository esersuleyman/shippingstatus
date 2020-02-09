package com.demo.shippingstatus.service.impl;

import com.demo.shippingstatus.domain.*;
import com.demo.shippingstatus.service.SaleServiceClient;
import com.demo.shippingstatus.service.ShippingServiceClient;
import com.demo.shippingstatus.service.ShippingStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import com.demo.shippingstatus.service.ProductServiceClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ShippingStatusServiceImpl implements ShippingStatusService {

    @Autowired
    private ProductServiceClient productServiceClient;

    @Autowired
    private SaleServiceClient saleServiceClient;

    @Autowired
    private ShippingServiceClient shippingServiceClient;

    public ShippingStatusDTO getShippingStatus(Integer id){

        ShippingStatusDTO shippingStatusDTO = new ShippingStatusDTO();

        SaleDTO saleDTO = saleServiceClient.getSale(id);

        ShippingDTO shippingDTO = shippingServiceClient.getShipping(saleDTO.getId());

        ProductDTO productDTO = productServiceClient.getProduct(saleDTO.getProductId());

        shippingStatusDTO.setProductDTO(productDTO);
        shippingStatusDTO.setSaleDTO(saleDTO);

        if(shippingDTO.isStatus() == Boolean.TRUE)
            shippingStatusDTO.setStatus(Status.TESLIM_EDILDI);
        else
            shippingStatusDTO.setStatus(Status.TESLIM_EDILMEDI);

        return shippingStatusDTO;
    }
}
