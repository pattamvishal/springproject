package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		
		//retrieve the bean from container 
		Coach thecoach=context.getBean("mycoach",Coach.class);
		
		// call the method
		
		System.out.println("baseball one");
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortunes());
		
		System.out.println("\n");
		
		System.out.println("track coach");
		Coach tcoach=context.getBean("mcoach",Coach.class);
		System.out.println(tcoach.getDailyWorkout());
		System.out.println(tcoach.getDailyFortunes());
		
		//System.out.println(tcoach.getDailyFortunes());
		//close the context
		context.close();
		
		
	}

}
