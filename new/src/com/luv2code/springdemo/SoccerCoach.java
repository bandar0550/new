package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	


	
	@Override
	public String getDailFortune() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getDailyWorkout() {
		return "this is soccerCoach";
	}
	
	

}
