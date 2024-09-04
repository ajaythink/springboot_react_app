package com.springboot_react_app.springboot_react_app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springboot_react_app.springboot_react_app.entity.Student;
import com.springboot_react_app.springboot_react_app.service.StudentServies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/student")
public class Student_Controller {

  @Autowired
  private StudentServies studentservies;

  @PostMapping(value = "/save")
  private String saveStudent(@RequestBody Student students) {
    studentservies.saveorUpdate(students);
    return students.getId();
  }

  @GetMapping(value = "/getall")
  private List<Student> getAllStudents() {
    return studentservies.listAll();
  }

  @PutMapping(value = "/edit/{id}")
  private Student update(@RequestBody Student student, @PathVariable(name = "id") String id) {
    student.setId(id);
    studentservies.saveorUpdate(student);
    return student;
  }

  @DeleteMapping(value = "/delete/{id}")
  private String delete(@PathVariable("id") String id) {
    studentservies.deleteStudent(id);
    return "Student Deleted with id : " + id;
  }

  @GetMapping(value = "/get/{id}")
  private Student getStudents(@PathVariable(name = "id") String studentID) {
    return studentservies.getStudentById(studentID);
  }

}
