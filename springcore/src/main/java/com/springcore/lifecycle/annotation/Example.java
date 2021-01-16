package com.springcore.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example(String subject) {
		super();
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	/**
	 * in xml file we neet to enable annotations for use
	 */
	@PostConstruct
	public void start() {
		System.out.println("Inside init");
		
	}
	@PreDestroy
	public void end() {
		System.out.println("inside destroy");
	}
}
