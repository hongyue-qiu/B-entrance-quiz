package com.thoughtworks.capability.gtb.api;

import com.thoughtworks.capability.gtb.domain.Student;
import com.thoughtworks.capability.gtb.dto.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

  @Autowired
  Students students;

  @GetMapping("/students")
  public List<Student> getAllStudents(){
    return students.getAllStudents();
  }

  @GetMapping("/group")
  public void getRandomStudentGroup(){
    students.getRandomStudentGroup();
  }

}
