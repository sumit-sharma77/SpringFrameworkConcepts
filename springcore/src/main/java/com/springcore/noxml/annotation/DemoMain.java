package com.springcore.noxml.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context=	new AnnotationConfigApplicationContext(JavaConfig.class);
	
	Student s1 = context.getBean("getStudent",Student.class);
	s1.study();
	}

}
