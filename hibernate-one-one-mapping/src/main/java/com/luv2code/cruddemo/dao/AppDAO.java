package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Instructor;
import org.springframework.context.annotation.Bean;

public interface AppDAO {
    void save(Instructor instructor);
    Instructor findById(int id);
    void delete(int id);
}

