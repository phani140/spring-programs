package com.sathya.springEx;

public class GreetingImpl implements Greeting {
	@Override
	public void greet() {
       System.out.println("This is the spring first example");
       System.out.println("Ratan sir is handsome");
	}
	
	public GreetingImpl() {
		System.out.println("GreetingImpl constructor:object created");
	}	

}
