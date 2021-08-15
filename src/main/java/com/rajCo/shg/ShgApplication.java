package com.rajCo.shg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.rajCo.shg.mappers")
public class ShgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShgApplication.class, args);
	}

}
