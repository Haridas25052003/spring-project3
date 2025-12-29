package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration
public class MyConfiguration {
	
	   @Bean
       public Student m1() {
		   Student s=new Student();
		   s.setId(10);
		   s.setName("haridas");
		   s.setCity("hingoli");
		   s.setPercentage(86.90);
    	   System.out.println("m1 method called");
    	   
    	   return s;
       }

	   @Bean
	   public void m2() {
		   System.out.println("m2 method called");
	   }
	   
	   @Bean
	   public void m3() {
		   System.out.println("m3 method called");
	   }
	   
	   @Bean 
	   public void m4() {
		   System.out.println("m4 method called");
	   }
}
