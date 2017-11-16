package com.bridgeit.controller.spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author GulabThakur
 * @This is my model Class
 */
@Entity
@Table(name="PERSION")
public class Persion {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String country;
	
	public void setId(int id) 
	{
		this.id=id;
	}
	 
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setCountry(String country) 
	{
		this.country=country;
	}
	@Override
	public String toString() 
	{
		return "id ="+id+" name "+name+" Country "+country+"";
		
	}
}
