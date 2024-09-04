package com.springboot_react_app.springboot_react_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot_react_app.springboot_react_app.entity.Student;
import com.springboot_react_app.springboot_react_app.repository.StudentRepo;

@Service
public class StudentServies {

  @Autowired
  private StudentRepo Repo;

  public void saveorUpdate(Student students) {
    Repo.save(students);
  }

  public List<Student> listAll() {
    return Repo.findAll();
  }

  public void deleteStudent(String id) {
    this.Repo.deleteById(id);
  }

  public Student getStudentById(String studentID) {
    return this.Repo.findById(studentID).get();
  }

}
