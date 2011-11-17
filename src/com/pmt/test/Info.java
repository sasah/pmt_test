package com.pmt.test;

import com.pmt.database.annotation.NotNull;
import com.pmt.database.annotation.PrimaryKey;
import com.pmt.sys.reflection.Entity;

@Entity
public class Info {
	@PrimaryKey
	private int id;

	@NotNull
	private int kind;

	@NotNull
	private String city;

	@NotNull
	private String address;

	private String metro;

	private String detail;

	private String exchange;

	@NotNull
	private String name;

	private String operations;

	private String wTime;

	private String wEnd;

	private Double distance;

	private Double latitude;

	private Double longitude;

	private String diner;

	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMetro() {
		return metro;
	}

	public void setMetro(String metro) {
		this.metro = metro;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOperations() {
		return operations;
	}

	public void setOperations(String operations) {
		this.operations = operations;
	}

	public String getwTime() {
		return wTime;
	}

	public void setwTime(String wTime) {
		this.wTime = wTime;
	}

	public String getwEnd() {
		return wEnd;
	}

	public void setwEnd(String wEnd) {
		this.wEnd = wEnd;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getDiner() {
		return diner;
	}

	public void setDiner(String diner) {
		this.diner = diner;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
