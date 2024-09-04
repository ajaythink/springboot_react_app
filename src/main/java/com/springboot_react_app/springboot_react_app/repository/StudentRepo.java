package com.springboot_react_app.springboot_react_app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot_react_app.springboot_react_app.entity.Student;

public interface StudentRepo extends MongoRepository<Student, String> {

}
