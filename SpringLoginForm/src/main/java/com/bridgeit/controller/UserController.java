package com.bridgeit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.model.UserModel;
import com.bridgeit.service.UserService;
import com.bridgeit.validation.ValidationInf;

@Controller
public class UserController {
	@Autowired
	private UserService userServiceImp;
	@Autowired
	private ValidationInf validation;
	@RequestMapping("/login")
	public ModelAndView showform() {

		return new ModelAndView("login", "command", new UserModel());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("user") UserModel user) {
		boolean status=validation.forSignUp(user);
		if(status) 
		{
			userServiceImp.ragistre(user);
			return new ModelAndView("redirect:/view");
		}
		return new ModelAndView("redirect:/login");
	}

	@RequestMapping("/view")
	public ModelAndView viewemp() {
		ModelAndView model = new ModelAndView();
		model.addObject("message","hii");
		return model;
	}
}
