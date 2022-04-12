package com.xebia.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = {"com.xebia.springweb.repo.ProductRepository"})
public class ProductrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductrestapiApplication.class, args);
	}

}
