package com.springcore.ReferenceInjecting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	ApplicationContext contxt=	new ClassPathXmlApplicationContext("com/springcore/ReferenceInjecting/refConfig.xml");
	
	A temp = contxt.getBean("aref",A.class);
	
	System.out.println(temp.getX());
	System.out.println(temp.getOb().getY());
	}

}
