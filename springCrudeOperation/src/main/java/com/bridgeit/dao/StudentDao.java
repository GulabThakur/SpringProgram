package com.bridgeit.dao;

import java.util.List;

import com.bridgeit.model.StudentClass;

public interface StudentDao {
			public void addStudent(StudentClass student) ;
			public List<StudentClass> getStudents();
			public void deleteStudent(StudentClass student);
			public StudentClass getStudent(int id);
			
}
