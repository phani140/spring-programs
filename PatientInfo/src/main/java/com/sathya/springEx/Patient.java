package com.sathya.springEx;

public class Patient {
	private String name;
	private int age;
	private Doctor doctor;
	private Pharmacy pharmacy;
	
	
	public Patient(String name, int age, Doctor doctor, Pharmacy pharmacy) {
		super();
		this.name = name;
		this.age = age;
		this.doctor = doctor;
		this.pharmacy = pharmacy;
	}


	public void details() {
		System.out.println("name of the patient is "+name+" Age of the patient is "+age);
		doctor.docDetails();
		pharmacy.PharmDetails();
		
	}
	

}
