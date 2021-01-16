package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext contxt=new ClassPathXmlApplicationContext("com/springcore/constructorInjection/CIconfig.xml");

		Person p = contxt.getBean("person",Person.class);
		
		System.out.println(p);
 	}

}
