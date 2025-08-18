package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Instructor;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class AppDAPImpl implements AppDAO{
    private EntityManager em;
    @Override
    @Transactional
    public void save(Instructor instructor) {
        em.persist(instructor);
    }
    @Override
    public Instructor findById(int id) {
        return em.find(Instructor.class, id);
    }
    @Override
    public void delete(int id) {
        em.remove(em.find(Instructor.class, id));
    }

    public AppDAPImpl(EntityManager entityManager) {
        this.em = entityManager;
    }

}
