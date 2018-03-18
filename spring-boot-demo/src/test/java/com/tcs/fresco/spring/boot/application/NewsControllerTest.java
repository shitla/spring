package com.tcs.fresco.spring.boot.application;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Map;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NewsControllerTest {

    private MockMvc mockMvc;
    
    @Autowired
    WebApplicationContext context;
    
   

    @Before
    public void setup() {
    	mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    
	@Test
	public void retrievetest_ok() throws Exception {
		
		 mockMvc.perform(get("/api/news/topstories" )).andDo(print())
	                .andExpect(status().isOk())
	                .andExpect(MockMvcResultMatchers.jsonPath("$.title").exists())
	                .andExpect(MockMvcResultMatchers.jsonPath("$.section").exists());
		 
	
	}


}
