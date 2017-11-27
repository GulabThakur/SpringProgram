package com.bridgeit.loginAndRagistation.email;


/**
 * @author GulabThakur
 */
public interface Iemail {
			/**
			 * @param string
			 * @return
			 */
			public String registration(String string ,String token);
			/**
			 * @param email
			 * @return
			 */
			public String forgotPassword(String email ,String token); 
}
