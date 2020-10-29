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

  // TODO GTB-知识点: - 推荐使用构造器注入
  // TODO GTB-工程实践: - 违反了封装性，字段应该使用private
  @Autowired
  Students students;

  @GetMapping("/students")
  public List<Student> getAllStudents(){
    return students.getAllStudents();
  }

  // TODO GTB-知识点: - 违反Restful实践, url不合理
  // TODO GTB-知识点: - 违反Restful实践, GET请求成功后应该返回数据
  @GetMapping("/group")
  public void getRandomStudentGroup(){
    students.getRandomStudentGroup();
  }

}
