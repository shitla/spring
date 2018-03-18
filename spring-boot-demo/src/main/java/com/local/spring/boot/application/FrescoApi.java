package com.local.spring.boot.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.local.spring.boot.consumer.application.Quote;

@SpringBootApplication

@ComponentScan("com.local.spring.*")
public class FrescoApi {
	public static void main(String args[]) {
		SpringApplication.run(FrescoApi.class, args);
	}	

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
			System.out.println(quote.toString());
		};
	}
}
