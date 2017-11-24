package com.bridgeit.loginAndRagistation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeit.loginAndRagistation.model.UserModel;
import com.bridgeit.loginAndRagistation.service.IuserModelservice;

@RestController
public class loginController {
		@Autowired
		private IuserModelservice userModelService;
		@RequestMapping(value="/singUp" ,method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<String> signIn(@RequestBody UserModel user)
		{ 
			userModelService.singUp(user);
			String message="Sucessfully ragister";
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}
		@RequestMapping(value="/login/{email}/{password}" ,method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<String> login(@PathVariable("email") String email,@PathVariable("password") String psd)
		{
			String name=userModelService.logIn(email, psd);
			return new ResponseEntity<String>(name,HttpStatus.OK);
			
		}
}
