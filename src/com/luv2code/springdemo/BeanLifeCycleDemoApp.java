package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.ast.BooleanLiteral;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("beanLifeCycle-applicationcontext.xml");
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
