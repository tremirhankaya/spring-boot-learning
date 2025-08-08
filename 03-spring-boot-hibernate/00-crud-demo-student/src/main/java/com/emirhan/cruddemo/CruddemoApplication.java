package com.emirhan.cruddemo;

import com.emirhan.cruddemo.dao.StudentDao;
import com.emirhan.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

StudentDao studentDao;
	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
	return  runner ->{
		//findStudent(studentDao);
		//createStudent(studentDao);
		queryForStudents(studentDao);
	};
	}

	private void queryForStudents(StudentDao studentDao) {
		List<Student> resultList= studentDao.findall();
		for (Student student : resultList) {
			System.out.println(student);
		}

	}

	private void findStudent(StudentDao studentDao) {
		System.out.println("Reading the student information...");
		Student myStudent=studentDao.findbyId(2);
		System.out.println("Student Information :"+myStudent);

	}

	private void createStudent(StudentDao studentDao) {
		//create the student object
		System.out.println("Creating new student object...");
		Student tempStudent= new Student("İnci","Uslu","inciuslu573@gmail.com");
		//save the student object
		System.out.println("Saving student object...");
		studentDao.save(tempStudent);

		//display the id of the saved student
		System.out.println("Saved student. Generated id: " +tempStudent.getId());

	}

}
