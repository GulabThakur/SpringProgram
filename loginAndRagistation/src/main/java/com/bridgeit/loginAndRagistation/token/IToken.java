package com.bridgeit.loginAndRagistation.token;

/**
 * @author GulabThakur
 * @Interace 
 */
public interface IToken {
	/**
	 * @param email
	 * @return token string format  
	 */
	public String genratedToken(String email);

	/**
	 * @param token
	 * @return email convert actual format
	 */
	public String verfivcation(String token);

}
