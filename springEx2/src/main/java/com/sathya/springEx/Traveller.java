package com.sathya.springEx;

public class Traveller {
	private String name;
	private String email;
	private long mobile;
	Vehicle vehicle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void startJourney(){
		System.out.println("Hey "+name+" Welcometo Travel World");
		System.out.println("Check your mobile number "+mobile+" emailId "+email);
		vehicle.move();
		
	}
}
