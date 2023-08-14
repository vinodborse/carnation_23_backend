package com.carnation.model;

public class User {

	private int rollno;
	private String name;
	private String address;
	private int mobile;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public User() {}
	
	public User(int rollno, String name, String address, int mobile) {

		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}
	
	
	
}
