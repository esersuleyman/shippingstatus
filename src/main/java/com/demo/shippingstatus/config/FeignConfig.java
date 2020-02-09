package com.demo.shippingstatus.config;

import com.demo.shippingstatus.service.ShippingStatusService;
import com.demo.shippingstatus.service.impl.ShippingStatusServiceImpl;
import com.squareup.okhttp.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }
}

