package com.bridgeit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.model.User;
import com.bridgeit.service.IUserService;

@Controller
public class HelloWorldController
 {

	@Autowired
	IUserService userService;
	
	
	@RequestMapping (value="/register", method= RequestMethod.POST)
	public ModelAndView saveUser(User user){

		userService.saveUserObject(user);
		
		return new ModelAndView();
	}
	
	@RequestMapping (value="/getuser/{id}", method= RequestMethod.GET)
	public ModelAndView getUser(@PathVariable int id){

		userService.getUser(id);
		
		return new ModelAndView();
	}

	/*public ModelAndView hello(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView model = new ModelAndView("index");

		model.addObject("msg", "hello....");

		return model;

	}*/

}
