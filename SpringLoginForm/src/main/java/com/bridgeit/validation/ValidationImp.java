package com.bridgeit.validation;


import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.model.UserModel;

public class ValidationImp implements ValidationInf{
 
	@Autowired 
	private ValidationInf validation;
	@Override
	public boolean forSignUp(UserModel user) {
		boolean status=false;
		String fname="([A-Za-z]{3,5}+)";
		String lname="([A-Za-z]{3,5}+)";
		if(fname.matches(user.getfName()) && lname.matches(user.getlName())) 
		{
			status=validation.password(user);
			if(status) 
			{
				return true;

			}
		}
		return false;
	}

	@Override
	public boolean password(UserModel user) {
		String check="([a-z1-9]{5,8})";
		if(user.getConformPassword().equals(user.getPassword())) 
		{
			if(check.matches(user.getPassword())) 
			{
				return true;
			}
		}
		return false;
	}


}
