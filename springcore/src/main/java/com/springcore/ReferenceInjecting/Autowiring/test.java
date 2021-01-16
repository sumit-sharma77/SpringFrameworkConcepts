package com.springcore.ReferenceInjecting.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	ApplicationContext contxt=	new ClassPathXmlApplicationContext("com/springcore/ReferenceInjecting/Autowiring/autoConfig.xml");
	
	Emp temp = contxt.getBean("emp1",Emp.class);
	
	System.out.println(temp);

	}

}
