package com.demo.shippingstatus.config;

import com.demo.shippingstatus.domain.ProductDTO;
import com.demo.shippingstatus.domain.SaleDTO;
import com.demo.shippingstatus.domain.ShippingDTO;
import com.demo.shippingstatus.service.ProductServiceClient;
import com.demo.shippingstatus.service.SaleServiceClient;
import com.demo.shippingstatus.service.ShippingServiceClient;
import com.demo.shippingstatus.service.ShippingStatusService;
import com.demo.shippingstatus.service.impl.ShippingStatusServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ShippingStatusService shippingStatusService(){
        return new ShippingStatusServiceImpl();
    }
}

