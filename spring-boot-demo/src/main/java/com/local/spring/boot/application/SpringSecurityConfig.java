package com.local.spring.boot.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AuthenticationEntryPoint authEntryPoint;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf()
		.disable();  
		     http.authorizeRequests()
		     .antMatchers("/h2","/api/**")
		     .permitAll()  
		     .anyRequest()
		     .authenticated();  
		     http.httpBasic()
		     .authenticationEntryPoint(authEntryPoint); 

	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("xp").password("xp").roles("USER");
	}
}