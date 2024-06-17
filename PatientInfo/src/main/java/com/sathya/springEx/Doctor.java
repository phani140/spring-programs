package com.sathya.springEx;

public class Doctor {
	private int id;
	private String name;
	public Doctor(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public void docDetails() {
		System.out.println("Id of doctor "+id);
		System.out.println("name of doctor "+name);
		
	}
	

}
