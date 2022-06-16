
package com.zensar.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity(name = "Studenttable")
public class Student {
	@Id
	private int StudentId;
	private String StudentName;
	private int StudentAge;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "StudentAddress", joinColumns = @JoinColumn(name = "SID"), inverseJoinColumns = @JoinColumn(name = "AID"))
	private List<Address> address;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentAge = studentAge;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getStudentAge() {
		return StudentAge;
	}

	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAge=" + StudentAge + "]";
	}
}
