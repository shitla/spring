package com.local.spring.boot.consumer.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NewsController {
    @Autowired
	private NewsService newsService;

    @RequestMapping(value = "/api/news/topstories", method = RequestMethod.GET)
	public  News getNews() throws Exception{
    	return newsService.getTopStories();
	}
	
}
