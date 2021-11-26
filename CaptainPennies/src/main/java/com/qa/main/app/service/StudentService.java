package com.qa.main.app.service;

import java.util.List;

import com.qa.main.app.model.Student;

//I gotta be honest i've read loads of StackOverflow to get this basic
public interface StudentService {
	//Declare methods to add, update, delete and get all records from database.
	
	//To save new student
	public Student saveStudent(Student student);
	
	//To update Student.I'm so not enjoying this.
	public Student updateStudent(Student student);
	
	//All students from database.
	public List<Student> findAllStudents();
	
	//To cut them off.
	public void deleteStudent(int id);
	
	

}
