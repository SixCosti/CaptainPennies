package com.qa.main.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qa.main.app.actual.service.StudentActualService;
import com.qa.main.app.model.Student;

@RestController
//Postman is required to do the operations i need so got to add cross origin annotation
@CrossOrigin("*")
public class HomeController {
	//To get some beans for some good coffee aka implementation class
	@Autowired
	private StudentActualService studentActualService;
	
	//To call save method or to save new Student
	@PostMapping(value = "saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println("✨Rock'n'Roll the High School✨");
		studentActualService.saveStudent(student);
		return student;
	}
	
	//To find all students
	@GetMapping(value = "getAllStudents")
	public List<Student> findAllStudents() {
		return studentActualService.findAllStudents();
	}
	
	//To update students
	@PutMapping("updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentActualService.updateStudent(student);
		}	
		
	//To delete students
	@DeleteMapping("deleteStudent")
	public String deleteStudent(@RequestParam int id) {
		studentActualService.deleteStudent(id);
		return "Student Deleted!";
	}
}
