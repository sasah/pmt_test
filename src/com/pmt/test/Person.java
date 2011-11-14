package com.pmt.test;

import com.pmt.bean.Introspectable;

@Introspectable
public class Person {
	private String firstName;
	private int middleName;
	private double lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		firstName = name;
	}

	public int getMiddleName() {
		return middleName;
	}

	public void setMiddleName(int name) {
		middleName = name;
	}

	public double getLastName() {
		return lastName;
	}

	public void setLastName(double name) {
		lastName = name;
	}
}
