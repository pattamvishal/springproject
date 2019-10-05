package com.luv2code.springdemo;

public class CricketCoach implements Coach {
private FortuneService fortuneserevice;


	
	
	
	public CricketCoach() {
		System.out.println(" CricketCoach :inside no argument constructor");

}

	public CricketCoach(FortuneService fortuneserevice) {
	
		System.out.println(" CricketCoach :inside setter argument method : setter fortune service");
	this.fortuneserevice = fortuneserevice;
}

	@Override
	public String getDailyWorkout() {
		return "practise fast bowling for 30 minutes";
	}

	@Override
	public String getDailyFortunes() {
		return fortuneserevice.getFortune();
	}

}
