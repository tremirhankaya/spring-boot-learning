package com.emirhan.cruddemo.dao;

import com.emirhan.cruddemo.entity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student theStudent);
    Student findbyId(Integer id);
    List<Student> findall();
    List<Student> findByLastName(String lastName);
    void update(Student theStudent);
    void delete(int studentId);
}
