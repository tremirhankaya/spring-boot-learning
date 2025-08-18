package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.AppDAO;
import com.luv2code.cruddemo.entity.Course;
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
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        return args -> {
            //createInstructor(appDAO);
            //findInstructor(appDAO);
            //deleteInstructor(appDAO);
            //findInstructor(appDAO);
            //findInstructorDetail(appDAO);
            //deleteInstructorDetail(appDAO);
            createInstructorWithCourses(appDAO);

        };
    }

    private void createInstructorWithCourses(AppDAO appDAO) {
        Instructor instructor = new Instructor("Şevval", "Yaldız", "svlyldnz@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("youtube.com/svl343", "Game Programming");
        instructor.setInstructorDetail(instructorDetail);
        Course tempCourse1 = new Course("Python Programming");
        Course tempCourse2 = new Course("C# Programming");
        instructor.Add(tempCourse1);
        instructor.Add(tempCourse2);

        System.out.println("Saving instructor...: " + instructor);
        System.out.println("The Courses...: " + instructor.getCourses());
        appDAO.save(instructor);
        System.out.println("Done!");


    }

    private void deleteInstructorDetail(AppDAO appDAO) {
        int theId = 1;
        appDAO.deleteInstructorDetailById(theId);
        System.out.println("Instructor(" + theId + ") detail deleted successfully ");
    }

    private void findInstructorDetail(AppDAO appDAO) {
        int theId = 1;
        InstructorDetail tempInstuctorDetail = appDAO.findInstructorDetailById(theId);
        System.out.println(theId + ": " + tempInstuctorDetail);
        System.out.println("The associated instructor:" + tempInstuctorDetail.getInstructor());
        System.out.println("Done!");

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
        Instructor instructor = new Instructor("Emirhan", "Kaya", "emirhan343@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("youtube.com/sazzmirk", "programming");
        instructor.setInstructorDetail(instructorDetail);
        appDAO.save(instructor);
    }


}
