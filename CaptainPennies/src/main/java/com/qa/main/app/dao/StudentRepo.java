package com.qa.main.app.dao;

import org.springframework.stereotype.Repository;

import com.qa.main.app.model.Student;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
