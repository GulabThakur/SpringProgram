package com.bridgeit;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Student;

@Controller
/*@RequestMapping("/student")*/
public class StudentController {

	@RequestMapping(value="/student",method = RequestMethod.GET)
	public ModelAndView student(){
		
		return new ModelAndView("student","command",new Student());
	}
	
	@RequestMapping(value="/addStudent",method= RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb")Student student,ModelMap model)
	{
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		model.addAttribute("password", student.getPassword());
		return "result";
	}
	

}