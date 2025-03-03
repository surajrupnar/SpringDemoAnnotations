package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//Method -1 - @Component("thatsillycoach")
//@Component("thatsillycoach")

//Method - 2 @component - default bean name
@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//DI - Constructor Injection using Autowired
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	//define default constructor
	public TennisCoach() {
		System.out.println("TenniseCoach: inside constructor");
	}
	
	//define setter injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("TenniseCoach: inside setFortuneService method");
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volly";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
