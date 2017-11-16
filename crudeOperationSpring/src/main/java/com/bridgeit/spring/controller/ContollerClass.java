package com.bridgeit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.spring.dao.EmployeeDao;
import com.bridgeit.spring.model.Employee;

@Controller
public class ContollerClass {
	
	@Autowired  
    EmployeeDao dao;
	@RequestMapping("/Hello")
	public ModelAndView delete() 
	{
		 ModelAndView modelAndView=new ModelAndView("haloo");
		 modelAndView.addObject("meassage", "Welcome To spring World");
		return modelAndView;
	}
 	
    @RequestMapping("/empform")  
    public ModelAndView showform(){  
    	System.out.println("hjkgkjhuhjkh");
    	
    	
        return new ModelAndView("empform", "command", new Employee());  
    }  
    
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("emp") Employee emp){  
        dao.save(emp);  
        return new ModelAndView("redirect:/viewemp");
    }  
    @RequestMapping("/viewemp")  
    public ModelAndView viewemp(){  
        List<Employee> list=dao.getEmployees();
       
        return new ModelAndView("viewemp","list",list);  
    }  
    @RequestMapping(value="/editemp/{id}")  
    public ModelAndView edit(@PathVariable int id){  
        Employee emp=dao.getEmpById(id);  
        return new ModelAndView("empeditform","command",emp);  
    }  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public ModelAndView editsave(@ModelAttribute("emp") Employee emp){  
        dao.update(emp);  
        return new ModelAndView("redirect:/viewemp");  
    }  
    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)  
    public ModelAndView delete(@PathVariable int id){  
        dao.delete(id);  
        return new ModelAndView("redirect:/viewemp");  
    }  
  
}
