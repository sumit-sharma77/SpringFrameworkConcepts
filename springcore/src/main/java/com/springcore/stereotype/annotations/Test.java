package com.springcore.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotations/stereoConfig.xml");
	Student stu=	con.getBean("student",Student.class);
	System.out.println(stu);
	}

}
