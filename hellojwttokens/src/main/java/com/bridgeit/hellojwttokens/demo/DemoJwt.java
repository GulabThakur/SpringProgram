package com.bridgeit.hellojwttokens.demo;

import java.util.Calendar;
import java.util.Date;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class DemoJwt {
	String key = "createKey";
	static String token = null;
	public static void main(String[] args) {
		System.out.println("Progeram started");
		DemoJwt dw = new DemoJwt();

		try {
			String token=dw.generateToken("julie");
			System.out.println("Token :"+token);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String checck=dw.validateToken(token);
		if(checck!=null) 
		{
			 System.out.println("welcome to you");
		}
		else 
		{
			System.out.println("your token is invalid");
		}
		System.out.println("Program ended");
	}

	

	public String generateToken(String id) {
		Calendar calendar = Calendar.getInstance();
		Date currentTime = calendar.getTime();
		calendar.add(Calendar.MINUTE, 300);
		Date expireTime = calendar.getTime();
		token = Jwts.builder().setIssuer(id).setIssuedAt(currentTime).setExpiration(expireTime)
				.signWith(SignatureAlgorithm.HS256, key).compact();
		return token;
	}

	public String validateToken(String token) {
		try {
			Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
			return claims.getIssuer();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
