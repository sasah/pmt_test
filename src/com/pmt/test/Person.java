package com.pmt.test;

import com.pmt.database.annotation.AutoIncrement;
import com.pmt.database.annotation.NotNull;
import com.pmt.database.annotation.PrimaryKey;
import com.pmt.database.annotation.Table;
import com.pmt.database.annotation.Unique;
import com.pmt.sys.reflection.Entity;

@Entity
@Table("sasa")
public class Person {
	@PrimaryKey
	@AutoIncrement
	private int a;
	@NotNull
	private Integer b;
	private double c;
	private Double d;
	@Unique
	private String e;
	private boolean f;
	private Boolean g;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public Double getD() {
		return d;
	}

	public void setD(Double d) {
		this.d = d;
	}

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public boolean isF() {
		return f;
	}

	public void setF(boolean f) {
		this.f = f;
	}

	public Boolean getG() {
		return g;
	}

	public void setG(Boolean g) {
		this.g = g;
	}
}
