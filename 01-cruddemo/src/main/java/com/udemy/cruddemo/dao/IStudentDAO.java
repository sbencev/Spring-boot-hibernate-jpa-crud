package com.udemy.cruddemo.dao;

import java.util.List;

import com.udemy.cruddemo.entity.Student;

public interface IStudentDAO {

	void save(Student theStudent);

	Student findById(Integer id);

	List<Student> findAll();

	List<Student> findByLastName(String theLastName);

	void update(Student theStudent);

	void delete(Integer id);

	int deleteAll();

}
