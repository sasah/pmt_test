package com.pmt.test;

import com.pmt.sys.reflection.Entity;
import com.pmt.sys.reflection.Index;
import com.pmt.sys.reflection.NotNull;
import com.pmt.sys.reflection.PrimaryKey;
import com.pmt.sys.reflection.Table;

@Entity
@Table("sasa")
public class Person {
	@Index(desc = false, unique = false)
	private String firstName;
	
	@NotNull
	@Index(desc = false, unique = true)
	private int middleName;
	
	@PrimaryKey
	@NotNull
	@Index(desc = true, unique = false)
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
