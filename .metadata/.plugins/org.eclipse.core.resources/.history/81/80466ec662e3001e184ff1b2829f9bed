package com.sathya.springEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	Patient patient=context.getBean("details2",Patient.class);
    	patient.details();
    	
    }
}
