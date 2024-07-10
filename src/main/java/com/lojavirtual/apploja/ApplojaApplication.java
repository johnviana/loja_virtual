package com.lojavirtual.apploja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "com.lojavirtual.apploja.domain.model")
@ComponentScan(basePackages = {"com.*"})
@EnableJpaRepositories(basePackages = {"com.lojavirtual.apploja.domain.repository"})
@EnableTransactionManagement
public class ApplojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplojaApplication.class, args);
	}

}
