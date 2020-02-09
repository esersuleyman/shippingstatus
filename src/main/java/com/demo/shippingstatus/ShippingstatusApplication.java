package com.demo.shippingstatus;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ShippingstatusApplication {

	public static void main(String[] args) {
SpringApplication.run(ShippingstatusApplication.class, args);
	}

}
