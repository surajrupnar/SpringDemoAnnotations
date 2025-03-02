package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//load the Spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from the spring container
		Coach theCoach = context.getBean("thatsillycoach", Coach.class);
		
		
		//call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
