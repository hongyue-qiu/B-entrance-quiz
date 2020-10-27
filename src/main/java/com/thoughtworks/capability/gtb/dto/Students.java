package com.thoughtworks.capability.gtb.dto;

import com.thoughtworks.capability.gtb.domain.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students {
  String[] strArray = {"成吉思汗", "鲁班七号", "太乙真人", "钟无艳", "花木兰", "雅典娜", "芈月",
          "白起", "刘禅", "庄周", "马超", "刘备", "哪吒", "大乔", "蔡文姬"};
  List<Student> list=new ArrayList<>();
  public List<Student> getAllStudents(){
    for(int i=0;i<strArray.length;i++){
      list.add(new Student(i+1,strArray[i]));
    }
	return list;
  }
  List<Student> allStudents=new ArrayList<>(list);
  public void getRandomStudentGroup(){
    Collections.shuffle(allStudents);
  }


}
