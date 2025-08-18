package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.AppDAO;
import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO  appDAO) {
		return args -> {
			createInstructor(appDAO);
			//findInstructor(appDAO);
			//deleteInstructor(appDAO);
			//findInstructor(appDAO);

		};
	}

	private void deleteInstructor(AppDAO appDAO) {
		appDAO.delete(1);
	}

	private void findInstructor(AppDAO appDAO) {
		Instructor tempInstructor = appDAO.findById(1);
		System.out.println("Instructor " + tempInstructor);
		System.out.println("Instructor detail " + tempInstructor.getInstructorDetail());
	}

	private void createInstructor(AppDAO appDAO) {
		Instructor instructor = new Instructor("İnci","Uslu","incius343@gmail.com");
		InstructorDetail  instructorDetail = new InstructorDetail("youtube.com/incius343153","playing basketball");
		instructor.setInstructorDetail(instructorDetail);
		appDAO.save(instructor);
	}


}
