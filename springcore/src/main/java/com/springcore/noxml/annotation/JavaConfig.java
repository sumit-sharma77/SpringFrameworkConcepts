package com.springcore.noxml.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.noxml.annotation") // since we removed @component above the student class so no need
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		Samosa samosa = new Samosa();
		return samosa;
	}
	
	@Bean
	public Student getStudent() {
		//creating a new student object
		//Student student = new Student();
		Student student = new Student(getSamosa()); // dependency injection of object by constructor
		return student;
	}
}
