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

import com.bridgeit.loginAndRagistation.email.Iemail;
import com.bridgeit.loginAndRagistation.model.UserModel;
import com.bridgeit.loginAndRagistation.service.IEncripted;
import com.bridgeit.loginAndRagistation.service.IuserModelservice;
import com.bridgeit.loginAndRagistation.token.IToken;
import com.bridgeit.loginAndRagistation.validation.Ivalidation;

/**
 * @author GulabThakur
 * @this class is control all activity like login and logOut
 */
@RestController
public class loginController {
	@Autowired
	private IuserModelservice userModelService;
	@Autowired
	private IEncripted encode;
	@Autowired
	private Ivalidation validation;
	@Autowired
	private Iemail email;
	@Autowired 
	private IToken token;

	/**
	 * @param user
	 * @return this method will be using for registration
	 */
	@RequestMapping(value = "/singUp", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> signIn(@RequestBody UserModel user) {
		String token2=token.genratedToken(user.getEmail());
		String check=email.registration(user.getEmail(), token2);
		String message = null;
		if(check!=null) 
		{
			String error = validation.valid(user);
			if (error == null) {
				String psd = encode.get(user.getPassword());
				System.out.println("encode :" + psd);
				user.setPassword(psd);
				userModelService.singUp(user);
				message = "Sucessfully ragister";
				return new ResponseEntity<String>(message, HttpStatus.OK);
			}
			message = error;
			return new ResponseEntity<String>(message, HttpStatus.OK);
			
		}
		else 
		{
			return new ResponseEntity<String>("email is wrong", HttpStatus.OK);
		}
	
		
	}

	/**
	 * @param email
	 * @param psd
	 * @stands for password
	 * @return userName
	 */
	@RequestMapping(value = "/login/{email}/{password}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> login(@PathVariable("email") String email, @PathVariable("password") String psd) {
		String name = userModelService.logIn(email, psd);
		return new ResponseEntity<String>(name, HttpStatus.OK);

	}
}
