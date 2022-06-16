package com.zensar.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//import java.util.Map;
//import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component("student")
//@Service("stud")
//@Controller("stud")
//@Repository("stud")
//@Scope("prototype")
public class Student {

	//@Value("${id}")
	private int studentId;
	//@Value("${name}")
	private String studentName;
	//@Value("${age}")
	private int studentAge;

	public Student() {
		super();
		System.out.println("iam inside deafult constructir");
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void myInit() {
		System.out.println("iam inside myinit method");
	}

	@PreDestroy
	public void myDestroy() {
		// TODO Auto-generated method stub
		System.out.println("iam inside destroy method");
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
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

	/*
	 * public void afterPropertiesSet() throws Exception { // TODO Auto-generated
	 * method stub System.out.println("iam inside afterset method"); }
	 */

	/*
	 * @Autowired
	 * 
	 * @Qualifier("add2") private Address address;
	 * 
	 * 
	 * // private Map<Integer,Address> address; private Map<Address, Integer>
	 * address;
	 * 
	 * private Properties properties;
	 * 
	 * public Student() { super();
	 * 
	 * }
	 * 
	 * public Student(int studentId, String studentName, int studentAge,
	 * Map<Address, Integer> address) { super(); this.studentId = studentId;
	 * this.studentName = studentName; this.studentAge = studentAge; this.address =
	 * address; }
	 * 
	 * public int getStudentId() { return studentId; }
	 * 
	 * public void setStudentId(int studentId) { this.studentId = studentId; }
	 * 
	 * public String getStudentName() { return studentName; }
	 * 
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 * 
	 * public int getStudentAge() { return studentAge; }
	 * 
	 * public void setStudentAge(int studentAge) { this.studentAge = studentAge; }
	 * 
	 * public Map<Address, Integer> getAddress() { return address; }
	 * 
	 * public void setAddress(Map<Address, Integer> address) { this.address =
	 * address; }
	 * 
	 * public Properties getProperties() { return properties; }
	 * 
	 * public void setProperties(Properties properties) { this.properties =
	 * properties; }
	 * 
	 * @Override public String toString() { return "Student [studentId=" + studentId
	 * + ", studentName=" + studentName + ", studentAge=" + studentAge +
	 * ", address=" + address + ", properties=" + properties + "]"; }
	 */

}
