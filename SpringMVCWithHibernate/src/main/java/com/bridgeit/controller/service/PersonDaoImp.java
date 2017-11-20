package com.bridgeit.controller.service;

import java.util.List;
import com.bridgeit.controller.spring.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonDaoImp implements PersonDao {
	PersonDao personDao;

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	@Transactional
	public void addPersion(Person person) {

		this.personDao.addPersion(person);
	}

	@Override
	@Transactional
	public void udatePersion(Person persion) {
		this.personDao.udatePersion(persion);
	}

	@Override
	@Transactional
	public List<Person> listPersion() {

		return this.listPersion();
	}

	@Override
	@Transactional
	public Person getPersion(int id) {
		return this.getPersion(id);
	}

	@Override
	@Transactional
	public void removePersion(int id) {
		this.removePersion(id);
	}

}
