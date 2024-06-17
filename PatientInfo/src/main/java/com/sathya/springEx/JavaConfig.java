package com.sathya.springEx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Doctor details() {
		Doctor doctor=new Doctor(25,"phani");
		return doctor;
	}
	@Bean
	public Pharmacy details1() {
		Pharmacy pharmacy=new Pharmacy("sri medicals","begumpet");
		return pharmacy;
		
	}
	
	@Bean
	public Patient details2() {
		Patient patient=new Patient("sai",32,details(),details1());
		return patient;
	}
	

}
