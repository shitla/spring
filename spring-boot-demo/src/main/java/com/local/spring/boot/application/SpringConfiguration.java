package com.local.spring.boot.application;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringConfiguration {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
