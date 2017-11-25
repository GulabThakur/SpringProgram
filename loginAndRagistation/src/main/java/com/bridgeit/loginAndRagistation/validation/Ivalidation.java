package com.bridgeit.loginAndRagistation.validation;

import com.bridgeit.loginAndRagistation.model.UserModel;

public interface Ivalidation {
	public boolean isName(UserModel user);

	public boolean ispsd(UserModel user);

	public boolean isemail(UserModel user);

	public String valid(UserModel user);
}
