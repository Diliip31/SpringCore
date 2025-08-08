package com.tnsif.springcoreexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
  public static void main(String[] args) {
	  //It reads and manages the beam
   ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
   
   College college =(College) context.getBean("collegeBean");
   college.show();
  }
}
