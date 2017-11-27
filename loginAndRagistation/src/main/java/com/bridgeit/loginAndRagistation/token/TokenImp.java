package com.bridgeit.loginAndRagistation.token;

import java.util.Calendar;
import java.util.Date;

import com.bridgeit.loginAndRagistation.email.EmailClass;
import com.bridgeit.loginAndRagistation.email.Iemail;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

/**
 * @author GulabThakur
 * @class this class use for create token ..
 */
public class TokenImp implements IToken {
	String key = "createKey";
	String token = null;

	/*
	 * this method using create token accept of email
	 */
	public String genratedToken(String email) {
		Calendar calendar = Calendar.getInstance();
		Date currentTime = calendar.getTime();
		calendar.add(Calendar.MINUTE, 3000);
		Date expireTime = calendar.getTime();

		token = Jwts.builder().setIssuer(email).setIssuedAt(currentTime).setExpiration(expireTime)
				.signWith(SignatureAlgorithm.HS256, key).compact();
		return token;
	}

	/*
	 * this method using for verify token..
	 */
	public String verfivcation(String token) {
		Claims clam;
		try {
			clam = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
			return clam.getIssuer();
		} catch (UnsupportedJwtException e) {
			// TODO Auto-generated catch block
		}
		return null;
	}

}
