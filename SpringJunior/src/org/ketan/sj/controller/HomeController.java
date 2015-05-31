package org.ketan.sj.controller;

import org.ketan.sj.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	ModelAndView defaultMethod(User user)
	{
		return new ModelAndView("loginJSP","loginObj",user);
	}
	
	@RequestMapping(value="/validateLogin", method=RequestMethod.POST)
	ModelAndView login(User loginData){
		
		return new ModelAndView("sucsessPage","msg",loginData);
	}
	
	@RequestMapping(value="/register" , method=RequestMethod.GET)
	ModelAndView registerUser(User registerObj)
	{
		return new ModelAndView("register","registerObj",registerObj);
	}
}
