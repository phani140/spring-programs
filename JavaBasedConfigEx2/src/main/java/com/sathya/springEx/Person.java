package com.sathya.springEx;

public class Person {
	private String  name;
	private String emailid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public void personInfo() {
		System.out.println("hey "+name+" welcome to satya ");
		System.out.println("your emai Id " +emailid);
	}

}
