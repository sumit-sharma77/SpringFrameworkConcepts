package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Using this way destroy method will not get called to call that we need to setup application hook
		 */
		/*ApplicationContext contxt =new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");*/
		AbstractApplicationContext contxt =new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
		contxt.registerShutdownHook();
		
		Samosa s1 = contxt.getBean("s1",Samosa.class);
		System.out.println(s1);
	}

}
