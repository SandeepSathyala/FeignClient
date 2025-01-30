package com.example.FeignClientRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientRestApplication.class, args);
	}

}
