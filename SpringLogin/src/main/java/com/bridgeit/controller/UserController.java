package com.bridgeit.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.dao.UserDao;
import com.bridgeit.model.User;


@Controller
public class UserController {
	
	@Autowired
	UserDao userDa;
	@RequestMapping("/userForm")  
    public ModelAndView showform(){  
    	
        return new ModelAndView("userForm", "command", new User());  
    }  
    
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("user") User user){  
    	userDa.ragistermethod(user);  
        return new ModelAndView("redirect:/view");
    }  
    @RequestMapping("/view")  
    public ModelAndView viewemp(){  
       ModelAndView model=new ModelAndView();
       model.addObject("message", "hello gys welcome");
    return model;  
    }  
}
