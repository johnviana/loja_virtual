package com.lojavirtual.apploja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.lojavirtual.apploja.model")
public class ApplojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplojaApplication.class, args);
	}

}
