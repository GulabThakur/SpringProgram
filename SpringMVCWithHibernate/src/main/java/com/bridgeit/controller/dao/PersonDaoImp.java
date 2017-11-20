package com.bridgeit.controller.dao;

import org.apache.taglibs.standard.lang.jstl.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.bridgeit.controller.spring.Person;

@Repository
public class PersonDaoImp implements PersonDao  {
    private static final Logger logger=LoggerFactory.logger(caller)
	@Override
	public void addPersion(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void udatePersion(com.bridgeit.controller.spring.Person persion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<com.bridgeit.controller.spring.Person> listPersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.bridgeit.controller.spring.Person getPersion(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePersion(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
