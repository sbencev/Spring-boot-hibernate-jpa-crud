package com.udemy.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.udemy.cruddemo.dao.IStudentDAO;
import com.udemy.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(IStudentDAO studentDAO) {

		return runner -> {
			// createStudent(studentDAO);
			createMultipleStudents(studentDAO);
			// readStudent(studentDAO);
			// queryForStudents(studentDAO);
			// queryForStudentsByLastName(studentDAO);
			// updateStudent(studentDAO);
			// deleteStudent(studentDAO);
			// deleteAll(studentDAO);
		};

	}

	/*
	 * private void deleteAll(IStudentDAO studentDAO) {
	 * 
	 * System.out.println("Deleting all students"); int numRowsDeleted =
	 * studentDAO.deleteAll(); System.out.println("Deleted row count: " +
	 * numRowsDeleted);
	 * 
	 * }
	 */

	/*
	 * private void deleteStudent(IStudentDAO studentDAO) {
	 * 
	 * int studentId = 5; System.out.println("Deleting student id: " + studentId);
	 * studentDAO.delete(studentId);
	 * 
	 * }
	 */

	/*
	 * private void updateStudent(IStudentDAO studentDAO) {
	 * 
	 * int studentId = 1; System.out.println("Geting student with id: " +
	 * studentId); Student myStudent = studentDAO.findById(studentId);
	 * 
	 * System.out.println("Updating student ..."); myStudent.setFirstName("Tamas");
	 * studentDAO.update(myStudent);
	 * 
	 * System.out.println("Updated student: " + myStudent);
	 * 
	 * }
	 */
	/*
	 * private void queryForStudentsByLastName(IStudentDAO studentDAO) {
	 * 
	 * List<Student> theStudents = studentDAO.findByLastName("Kis");
	 * 
	 * for (Student tempStudent : theStudents) {
	 * 
	 * System.out.println(tempStudent);
	 * 
	 * }
	 * 
	 * }
	 */

	/*
	 * private void queryForStudents(IStudentDAO studentDAO) {
	 * 
	 * List<Student> theStudents = studentDAO.findAll();
	 * 
	 * for (Student tempStudent : theStudents) {
	 * 
	 * System.out.println(tempStudent);
	 * 
	 * }
	 * 
	 * }
	 */

	/*
	 * private void readStudent(IStudentDAO studentDAO) {
	 * 
	 * System.out.println("Creating new student object ..."); Student tempStudent =
	 * new Student("Bence", "Sulyok", "sulyokb@gmail.com");
	 * 
	 * System.out.println("Saving the student ..."); studentDAO.save(tempStudent);
	 * 
	 * int theId = tempStudent.getId();
	 * System.out.println("Saved student. Generated id: " + theId);
	 * 
	 * System.out.println("Retrieving student with id: " + theId); Student myStudent
	 * = studentDAO.findById(theId);
	 * 
	 * System.out.println("Found the student: " + myStudent);
	 * 
	 * }
	 */

	private void createMultipleStudents(IStudentDAO studentDAO) {

		System.out.println("Creating 3 student object ...");

		Student tempStudent0 = new Student("Bence", "Sulyok", "sulyokbencevalentin@gmail.com");
		Student tempStudent1 = new Student("Bela", "Nagy", "nagybela@gmail.com");
		Student tempStudent2 = new Student("Bela", "Kis", "kis@gmail.com");

		System.out.println("Saving the students...");

		studentDAO.save(tempStudent0);
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);

	}

	/*
	 * private void createStudent(IStudentDAO studentDAO) {
	 * 
	 * System.out.println("Creating new student object ...");
	 * 
	 * Student tempStudent = new Student("Bence", "Sulyok",
	 * "sulyokbencevalentin@gmail.com");
	 * 
	 * System.out.println("Saving the student..."); studentDAO.save(tempStudent);
	 * 
	 * System.out.println("Saved student. Generated id: " + tempStudent.getId());
	 * 
	 * }
	 */

}
