package com.qa.main.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		System.out.println("Rock'n'Roll the High School");
		studentActualService.saveStudent(student);
		return student;
	}
		
}
