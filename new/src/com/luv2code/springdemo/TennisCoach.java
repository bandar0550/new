package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice you backhand volley: bandar";
	}

}
