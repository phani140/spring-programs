package com.sathya.springEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	System.out.println("object creatwd");
    	
    	System.out.println("**************");
    	
    	Person person=context.getBean("person1",Person.class);
    	person.personInfo();
    	
    	System.out.println("**************");

    	Person person1=context.getBean("person2",Person.class);
    	person1.personInfo();
    }
}
