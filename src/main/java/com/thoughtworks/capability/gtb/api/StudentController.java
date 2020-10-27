package com.thoughtworks.capability.gtb.api;

import com.thoughtworks.capability.gtb.domain.Student;
import com.thoughtworks.capability.gtb.dto.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class StudentController {
  @Autowired
  Students students;

  @GetMapping("/students")
  public List<Student> getAllStudents(){
    return students.getAllStudents();
  }
}
