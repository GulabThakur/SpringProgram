package com.bridgeit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.model.UserModel;
import com.bridgeit.service.UserServiceImp;

@Controller
public class UserController {
	@Autowired
    private UserServiceImp userServiceImp;
	
	@RequestMapping("/login")  
    public ModelAndView showform(){  
		System.out.println("ghjhhhhjkjhkjh");
    	return new ModelAndView("login", "command", new UserModel());  
    }  
	@RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("user") UserModel user){  
		System.out.println("ghggg");
		userServiceImp.ragistre(user);;  
        return new ModelAndView("redirect:/view");
    } 
	
	@RequestMapping("/view")  
    public ModelAndView viewemp(){  
       ModelAndView model=new ModelAndView();
       model.addObject("message", "hello gys welcome");
    return model;  
    }  
}
