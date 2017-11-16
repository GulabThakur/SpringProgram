package com.bridgeit.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgeit.model.StudentClass;
@Repository ("studentDao")
public class StudentDaoImp  implements StudentDao{
   
	@Autowired
	private SessionFactory session;
	
	public void addStudent(StudentClass student) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(student);
	}

	@SuppressWarnings("unchecked")
	public List<StudentClass> getStudents() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createCriteria(StudentClass.class).list();
	}

	public StudentClass getStudent(int  id) {
		// TODO Auto-generated method stub
		return session.getCurrentSession().get(StudentClass.class, id);
	}

	public void deleteStudent(StudentClass student) {
		// TODO Auto-generated method stub
		session.getCurrentSession().createQuery("delete from employee2 where id='"+student.getStudentId()+"'").executeUpdate();
	}

	
}
