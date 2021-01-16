package com.springcore.lifecycle.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Using this way destroy method will not get called to call that we need to setup application hook
		 */
		/*ApplicationContext contxt =new ClassPathXmlApplicationContext("com/springcore/lifecycle/annotation/lifeconfig.xml");*/
		AbstractApplicationContext contxt =new ClassPathXmlApplicationContext("com/springcore/lifecycle/annotation/lifeconfig.xml");
		contxt.registerShutdownHook();
		
		Example e1 = contxt.getBean("e1",Example.class);
		System.out.println(e1);
	}

}
