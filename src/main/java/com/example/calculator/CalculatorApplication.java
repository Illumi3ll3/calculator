package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

import com.example.calculator.security.APISecurityConfig;
import com.fasterxml.jackson.core.JsonParser;

@Import(APISecurityConfig.class)
@SpringBootApplication//(exclude= {SecurityAutoConfiguration.class})
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		
	}

}
