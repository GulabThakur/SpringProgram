package com.bridgeit.controller.dao;

import java.util.List;

import com.bridgeit.controller.spring.Person;

/**
 * @author GulabThakur
 * @InterFace
 */
public interface PersonDao {
	/**
	 * @ store record
	 */
	public void addPersion(Person person);

	/**
	 * @param persion
	 * @ update record with help of PersionId
	 */
	public void udatePersion(Person persion);

	/**
	 * @return list of all Person from data base
	 */
	public List<Person> listPersion();

	/**
	 * @param id
	 * @return get one person belong to this id
	 */
	public Person getPersion(int id);

	public void removePersion(int id);
}
