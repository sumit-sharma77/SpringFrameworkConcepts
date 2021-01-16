package com.springcore.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //will make camelcase variable student
//@Component("ob")// will make variable ob
@Scope("prototype")
public class Student {

	@Value("sumit")
	private String studentName;
	@Value("Jind")
	private String city;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
}
