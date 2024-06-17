package com.sathya.springEx;

public class Pharmacy {
	private String name;
	private String location;
	public Pharmacy(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public void PharmDetails() {
		System.out.println("name of pharmacy "+name);
		System.out.println("location of pharmacy "+location);
	}
		

}
