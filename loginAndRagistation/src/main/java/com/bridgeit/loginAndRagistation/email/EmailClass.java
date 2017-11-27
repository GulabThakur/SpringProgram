package com.bridgeit.loginAndRagistation.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailClass implements Iemail {

	public String registration(String user, String token) {
		final String from = "gulabthakur238@gmail.com";
		final String psd = "7024082813";
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		// get Session
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, psd);
			}
		});
		// compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(user));
			message.setSubject("Docment");
			message.setText(token);
			// send message
			Transport.send(message);
			String condition ="email send sucess full";
			if(condition!=null) 
			{
				return condition;
			}
			else 
			{
				return null;
			}
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

		
	}

	public String forgotPassword(String email, String token) {
		// TODO Auto-generated method stub
		return null;
	}

}
