package com.springcore.colloctions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext contxt=new ClassPathXmlApplicationContext("com/springcore/colloctions/collectionconfig.xml");
		
		Emp emp1 = contxt.getBean("emp",Emp.class);
		System.out.println(emp1);
	}

}
