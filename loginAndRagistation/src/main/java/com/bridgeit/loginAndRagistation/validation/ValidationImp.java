package com.bridgeit.loginAndRagistation.validation;

import com.bridgeit.loginAndRagistation.model.UserModel;

public class ValidationImp implements Ivalidation{

	
	public boolean isName(UserModel user) {
		if(user.getfName().matches("[a-zA-Z]*") & user.getlName().matches("[a-zA-Z]*")){
			return true;
		}
		else{
			return false;
		}
		
	}

	
	public boolean ispsd(UserModel user) {
		if(user.getPassword().length()>=8)
		{
			return true;
		}
		else{
			return false;
		}
	}


	public boolean isemail(UserModel user) {
		if(user.getEmail().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
		{
			return true;
		}
		else{
			return false;
		}
	}

	
	public String valid(UserModel user) {
		if(!isName(user)){
			return "Name is not correct.";
		}
		else if(!ispsd(user)){
			return "Password is not correct.";
		}
		
		else if(!isemail(user)){
			return "UserName is not correct";
		}
		else{
			return null;
		}
	}

}
