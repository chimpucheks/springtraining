package com.zensar.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int studentId;

	private String studentName;

	private int studentAge;
	
	@Autowired
	private Address address;// main important for autowire bytype:address

	
	
	
	
	public Student() {
		super();
	}
	
	
	
	public Student(Address address) {
		super();
		this.address = address;
	}





	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(int studentId, String studentName, int studentAge, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.address = address;
	}

	
	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", address=" + address + "]";
	}

}