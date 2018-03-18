package com.local.spring.boot.consumer.application;

import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class NewsService {
    @Autowired
	RestTemplate restTemplate;
	
	public News getTopStories() {
		return restTemplate.getForObject("http://api.nytimes.com/svc/topstories/v2/home.json?api-key=76d697c7f4f44dddb147b2787416ac52", APIResponse.class).getResults().get(0);
	}
}
