package com.seleniumexpress.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	
	public Human() {
		
	}
    
	
	public Human(Heart heart) {

		this.heart = heart;
		System.out.println("human constr called");
	}

	@Autowired
	@Qualifier("heartHuman")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {

		if (heart != null) {

			heart.pump();
			System.out.println("Name of animal " + heart.getNameOfAnimal() + "No of Heart " + heart.getNoOfHeart());
		} else {
			System.out.println("dead");

		}
	}
}
