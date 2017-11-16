package com.bridgeit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bridgeit.dao.StudentDao;
import com.bridgeit.model.StudentClass;
@Service("studentService")
@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
public class StudentServiceImp implements StudentService{
	@Autowired
	private StudentDao studendao;
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	
	public void addstudent(StudentClass student) {
		studendao.addStudent(student);
	}

	
	public List<StudentClass> listEmployeess() {
		// TODO Auto-generated method stub
		return studendao.getStudents();
	}

	
	public StudentClass getEmployee(int stId) {
		// TODO Auto-generated method stub
		return studendao.getStudent(stId);
	}

	
	public void deleteStudent(StudentClass student) {
		// TODO Auto-generated method stub
		studendao.deleteStudent(student);
	}

}
