package com.sathya.springEx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Person person1(){
		Person person=new Person();
		person.setName("phani");
		person.setEmailid("phani@gmail.com");
		return person;
	}
		
		@Bean
		public Person person2(){
			Person person1=new Person();
			person1.setName("Chinni");
			person1.setEmailid("Chinni@gmail.com");
			return person1;
		}
	
	
}
