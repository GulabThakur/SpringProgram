package com.bridgeit.loginAndRagistation.controller;



import org.springframework.security.crypto.bcrypt.BCrypt;

public class Testclass {
		public static void main(String[] args) {
			System.out.println("Program Started");
			String code=Testclass.encode("123456");
			BCrypt value=new BCrypt();
			System.out.println("Program Ended");
		}
		static  String encode(String psd) 
		{
			String pst=BCrypt.gensalt(10);
			String hash_pass=BCrypt.hashpw(psd, pst);
			return hash_pass;
			
		}
}
