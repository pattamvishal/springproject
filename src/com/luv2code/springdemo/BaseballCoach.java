package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	
	

	
	public BaseballCoach(FortuneService thefortuneservice) {
		fortuneservice = thefortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "practise 30 minutes of batting";
	}

	@Override
	public String getDailyFortunes() {
		return fortuneservice.getFortune();
	}

}
