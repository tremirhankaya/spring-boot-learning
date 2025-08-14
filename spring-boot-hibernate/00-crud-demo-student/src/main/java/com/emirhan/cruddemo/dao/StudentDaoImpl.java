package com.emirhan.cruddemo.dao;

import com.emirhan.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentDaoImpl implements StudentDao {
    //define field for entity manager
    private EntityManager entityManager;

//inject entity manager using contructor injection

//implement save method


    @Autowired
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);


    }

    @Override
    public Student findbyId(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findall() {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student order by lastName", Student.class);

        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query = entityManager.createQuery(
                "FROM Student WHERE lastName = :theLastName", Student.class);
        query.setParameter("theLastName", lastName);
        return query.getResultList();
    }
    @Transactional
    @Override
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Transactional
    @Override
    public void delete(int studentId) {
       Student theStudent = entityManager.find(Student.class, studentId);
       if (theStudent != null) {
           entityManager.remove(theStudent);
       }
    }
}
