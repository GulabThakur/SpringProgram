package com.bridgeit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
			ModelAndView nodel=new ModelAndView("loginForm","command",new UserModel());
			System.out.println(nodel);
			return nodel;
			
		}
		@RequestMapping(value="/save1/{Email}/{password}" ,method=RequestMethod.GET)
		public ModelAndView loginSave(@PathVariable("Email") String email,@PathVariable("password") String psd ) {
			String user2=userServiceImp.singUp(email, psd);
			System.out.println("user "+user2);
			if(user2!=null)
			{
				return new ModelAndView("view2", "command" ,user2);
			}
			return new ModelAndView("redirect:/loginForm");
		}
	
}
