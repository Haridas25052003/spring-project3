package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	   @Bean
       public void m1() {
    	   System.out.println("m1 method called");
       }

}
