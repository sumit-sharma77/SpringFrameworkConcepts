package com.springcore.lifecycle.byInterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Using this way destroy method will not get called to call that we need to setup application hook
		 */
		/*ApplicationContext contxt =new ClassPathXmlApplicationContext("com/springcore/lifecycle/byInterfaces/lifeconfig.xml");*/
		AbstractApplicationContext contxt =new ClassPathXmlApplicationContext("com/springcore/lifecycle/byInterfaces/lifeconfig.xml");
		contxt.registerShutdownHook();
		
		Pepsi p1 = contxt.getBean("p1",Pepsi.class);
		System.out.println(p1);
	}

}
