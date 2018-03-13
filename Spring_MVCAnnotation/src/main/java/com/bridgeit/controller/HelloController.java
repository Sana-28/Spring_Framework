package com.bridgeit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String HelloController() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Hello World!");
		return "Hello";
	}
}
