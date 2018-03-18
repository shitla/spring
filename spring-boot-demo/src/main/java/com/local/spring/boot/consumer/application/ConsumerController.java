package com.local.spring.boot.consumer.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("v1/demo/")
@EnableAutoConfiguration
public class ConsumerController {
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/apiconsumer/quote", method = RequestMethod.GET)
	public @ResponseBody Quote getQuote()  {
		return restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);

	}
	
	@RequestMapping(value = "/apiconsumer/nyt/topstories", method = RequestMethod.GET)
	public @ResponseBody Object getStories()  {
		return restTemplate.getForObject("http://api.nytimes.com/svc/topstories/v2/home.json?api-key=76d697c7f4f44dddb147b2787416ac52", Object.class);

	}
	
	@RequestMapping(value = "/apiconsumer/nyt/topstories/news", method = RequestMethod.GET)
	public @ResponseBody Object getStoriesNews()  {
		return restTemplate.getForObject("http://api.nytimes.com/svc/topstories/v2/home.json?api-key=76d697c7f4f44dddb147b2787416ac52", APIResponse.class).getResults();

	}
}
