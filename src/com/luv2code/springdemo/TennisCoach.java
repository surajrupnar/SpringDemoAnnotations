package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
//Method -1 - @Component("thatsillycoach")
//@Component("thatsillycoach")

//Method - 2 @component - default bean name
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volly";
	}

}
