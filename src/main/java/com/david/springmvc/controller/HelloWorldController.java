package com.david.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloWorldController {
	
	@RequestMapping(method= RequestMethod.GET)
	public ModelAndView sayHello(){
		ModelAndView model=new ModelAndView("welcome");
		model.addObject("greeting", "Hello World from Spring 4 MVC");
		return model;
	}
	
	@RequestMapping(value="/helloagain", method=RequestMethod.GET)
	public ModelAndView sayHelloAgain(){
		ModelAndView model=new ModelAndView("welcome");
		model.addObject("greeting","Hello World Again, from Spring 4 MVC");
		return model;
	}
	
}
