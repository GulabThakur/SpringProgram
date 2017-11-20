package com.bridgeit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bridgeit.model.User;
import com.bridgeit.service.UserService;

@Controller
public class UserController {
	
	 @Autowired
	 private UserService personService;
     @RequestMapping(value="/user" ,method=RequestMethod.GET)
     public String ListUser(Model model) 
     {
    	 System.out.println("123244");
    	 model.addAttribute("user", new User());
    	 //model.addAttribute("listUser", this.personService.listUser());
    	 System.out.println("return");
    	 return "user";
     }
     @RequestMapping(value="/user/add",method=RequestMethod.POST)
     public String addPersion(@ModelAttribute("user") User user) 
     {
    	 System.out.println("JSP123");
    	 if(user.getId()==0) 
    	 {
    		 this.personService.addUser(user);
    	 }
    	 else 
    	 {
    		 this.personService.update(user);;
    	 }
    	 return "redirect:/user";
     }
     @RequestMapping("/remove/{id}")
     public String remove(@PathVariable("id") int id) 
     {
    	 this.personService.deleteUser(id);
    	 return "redirect:/user";
     }
     @RequestMapping("/edit/{id}")
     public String editUser(@PathVariable("id") int id ,Model model) 
     {
    	 model.addAttribute("user",this.personService.getUser(id));
    	 return "user";
     }
}
