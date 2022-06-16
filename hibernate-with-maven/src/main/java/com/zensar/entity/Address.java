
package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int houseNo;
	private String state;
	private String city;

	public Address(int i, String string, String string2, int j) {
		super();
	}

	public Address(int houseNo, String state, String city) {
		super();
		this.houseNo = houseNo;
		this.state = state;
		this.city = city;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", state=" + state + ", city=" + city + "]";
	}

}
