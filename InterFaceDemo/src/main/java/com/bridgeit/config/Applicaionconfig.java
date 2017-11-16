package com.bridgeit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bridgeit.model.ColorClass;
import com.bridgeit.model.RedColor;
@Configuration
public class Applicaionconfig {
	@Bean(name="mycolorBean")
	public ColorClass getMyColor() 
		{
			return new RedColor();
			
		}
}
