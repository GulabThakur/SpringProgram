package com.bridgeit.springProjrct2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greek")
public class HelloClass {
		@RequestMapping("/hello/{counteryname}/{username}")
		public ModelAndView show(@PathVariable("username") String name,@PathVariable("counteryname") String counrtry) 
		{
			 ModelAndView modelAndView=new ModelAndView("helloPage");
			 modelAndView.addObject("meassage", "Welcome To spring World"+name+" contry name is"+counrtry);
			return modelAndView;
		}
		@RequestMapping("/welcome")
		public ModelAndView delete() 
		{
			 ModelAndView modelAndView=new ModelAndView("welcomePage");
			 modelAndView.addObject("meassage", "Welcome To spring World");
			return modelAndView;
		}
}
