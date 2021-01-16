package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {

	@Id
	@Column(name="student_id")
	private int studentId;
	@Column(name="student_name")
	private String StudentName;
	@Column(name="student_city")
	private String StudentCity;
	public Student(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		StudentCity = studentCity;
	}
	public Student() {
		
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	
	
}
