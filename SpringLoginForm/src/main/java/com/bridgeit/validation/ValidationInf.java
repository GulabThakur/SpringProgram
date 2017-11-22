package com.bridgeit.validation;

import com.bridgeit.model.UserModel;

public interface ValidationInf {
		public boolean forSignUp(UserModel user);
		public boolean password(UserModel user);
}
