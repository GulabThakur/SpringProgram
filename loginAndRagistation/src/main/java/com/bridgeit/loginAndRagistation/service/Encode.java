package com.bridgeit.loginAndRagistation.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encode implements IEncripted {

	
	public String get(String password) {

		try {
	           // Create MessageDigest instance for SHA1
	           MessageDigest md = MessageDigest.getInstance("SHA1");
	           
	           //Add password bytes to digest
	           md.update(password.getBytes());
	           
	           //Get the hash's bytes 
	           byte[] bytes = md.digest();
	           
	           //This bytes[] has bytes in decimal format;
	           //Convert it to hexadecimal format
	           StringBuilder sb = new StringBuilder();
	           
	           for(int i=0; i< bytes.length ;i++)
	           {
	               sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
	           }
	           
	           //Get complete hashed password in hex format
	            return  sb.toString();
	       } 
	       catch (NoSuchAlgorithmException e) 
	       {
	           try {
				throw new Exception("Unable to encrypt the pasword - " + e.getMessage() );
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	       }
		return null;
	}

}
