package com.javainterviewpoint.HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVC_Controller {
	@RequestMapping(value ="/HelloWorld",method = RequestMethod.POST)
	public ModelAndView Welcome() {
		String message = "Welcome to JavaInterviewPoint Spring 3 MVC Tutorial";
		return new ModelAndView("Welcome", "message", message);
	}
}