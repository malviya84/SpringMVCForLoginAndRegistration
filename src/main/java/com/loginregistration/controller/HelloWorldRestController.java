package com.loginregistration.controller;



import javax.ws.rs.core.*; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.loginregistration.pojo.Message;


@RestController
@RequestMapping("rest")

public class HelloWorldRestController {
	@RequestMapping(value ="/WelcomeService",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public String Welcome()
	{
		return "Welcome to rest template Example";
		
	}
	
	@RequestMapping(value ="/hello/{player}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON)
	@ResponseBody
	public Message getMessage(@PathVariable("player") String Player)
	{
		Message msg = new Message("Welcome","Mr." + Player);
		return msg;
	}

}
