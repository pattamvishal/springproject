package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.ast.BooleanLiteral;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("beanScope-applicationcontext.xml");
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		
		System.out.println("\n pointing towards the same object: "+ result);
		
		System.out.println("\n memory location for theCoach :" + theCoach);
		
		System.out.println("\n memeory location of alphaCoach:" + alphaCoach);

	}

}
