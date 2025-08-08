package com.tnsif.springcore2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
 private Student student;
 
@Autowired
 public College(Student student) {
	this.student = student;
	
 }
public void shoeCollegeDetails() {
	System.out.println("welcome to College...");
	student.showStudent();
}

}
