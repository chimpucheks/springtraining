package com.zensar.beans;

public class Department {
	
	private String departmentName;
	private String departmentDetails;
	
	
	public Department() {
		super();
			}


	public Department(String departmentName, String departmentDetails) {
		super();
		this.departmentName = departmentName;
		this.departmentDetails = departmentDetails;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getDepartmentDetails() {
		return departmentDetails;
	}


	public void setDepartmentDetails(String departmentDetails) {
		this.departmentDetails = departmentDetails;
	}


	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentDetails=" + departmentDetails + "]";
	}
	
	
	
}
