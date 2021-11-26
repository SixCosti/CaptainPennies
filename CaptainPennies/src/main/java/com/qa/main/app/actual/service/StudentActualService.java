package com.qa.main.app.actual.service;

//Don't even trip dawg.

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.main.app.dao.StudentRepo;
import com.qa.main.app.model.Student;
import com.qa.main.app.service.StudentService;

@Service
public class StudentActualService implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
		//Same save method is used for both update and save, why not.
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepo.findAll();
		//It returns a list so casting is needed
	}

	@Override
	public void deleteStudent(int id) {
		// Here they get their head chopped off, yaay.
		studentRepo.deleteById(id);
	}
	

}
