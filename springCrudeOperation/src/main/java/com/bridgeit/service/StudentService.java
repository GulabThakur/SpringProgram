package com.bridgeit.service;

import java.util.List;

import com.bridgeit.model.StudentClass;

public interface StudentService {
	public void addstudent(StudentClass student);

	 public List<StudentClass> listEmployeess();
	 
	 public StudentClass getEmployee(int stId);
	 
	 public void deleteStudent(StudentClass student);
}
