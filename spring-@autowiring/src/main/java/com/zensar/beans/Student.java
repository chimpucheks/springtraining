package com.zensar.beans;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int studentId;

	private String studentName;

	private int studentAge;
	
	//@Autowired    //1.property/field
	//@Qualifier("address1")
	
	
	
	private Set<Address> address;// main important for autowire bytype:address

	
	
	
	
	public Student() {
		super();
	}
	
	
	//@Autowired  //2. on constructor
	public Student(Set<Address> address) {
		super();
		this.address = address;
	}





	public Set<Address> getAddress() {
		return address;
	}

	//@Autowired  //3. on setter method
	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Student(int studentId, String studentName, int studentAge, Set<Address>address) {
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