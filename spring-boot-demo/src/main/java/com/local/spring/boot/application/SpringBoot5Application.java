package com.local.spring.boot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBoot5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot5Application.class, args);
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
