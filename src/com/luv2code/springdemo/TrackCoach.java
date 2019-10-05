package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneservice;

	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneservice) {
		super();
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}










