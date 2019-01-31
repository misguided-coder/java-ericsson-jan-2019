package com.example;

public class LuxuryCar extends Car  { //is-a relationship

	@Override
	public void canStart() {
		System.out.println("LuxuryCar can start with voice command!!!!");
	}
	
	public void speedUp() {
		System.out.println("LuxuryCar is speeding up.......");
	}

}
