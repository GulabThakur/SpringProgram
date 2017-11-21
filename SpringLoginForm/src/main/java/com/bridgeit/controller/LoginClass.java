package com.bridgeit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.model.UserModel;
import com.bridgeit.service.UserService;

@Controller
public class LoginClass {
		@Autowired 
		private UserService userServiceImp;
		@RequestMapping("loginForm")
		public ModelAndView fetchData() 
		{
			return new ModelAndView("loginForm","command",new UserModel());
			
		}
		@RequestMapping(value="/save1/{Email}/{password}")
		public ModelAndView loginSave(@PathVariable("Email") String email,@PathVariable("password") String psd) 
		{
			System.out.println("ghggg");
			System.out.println("emai"+email);
			System.out.println("pad"+psd);
			UserModel user=userServiceImp.singUp(email, psd);
			return new ModelAndView("view2", "command" ,user);
		}
	
}
