package com.sathya.springEx;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

	@Override
	public void message() {
		System.out.println("you will get email updates");
		System.out.println("please check your mail");
		
	}
	

}
