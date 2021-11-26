package com.qa.main.app.dao;

import org.springframework.stereotype.Repository;

import com.qa.main.app.model.Student;

import org.springframework.data.repository.CrudRepository;

//I need this interface for obvious reasons
@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
