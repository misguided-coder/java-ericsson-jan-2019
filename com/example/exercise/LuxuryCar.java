package com.example.exercise;

public class LuxuryCar extends Car implements Brakeable {

	@Override
	public void canStart() {
		System.out.println("LuxuryCar can start with voice command!!!!");
	}

	@Override
	public void canRepair() {
		System.out.println("LuxuryCar can be repaired!!!");
	}

	@Override
	public void speedUp() {
		System.out.println("LuxuryCar is speeding up.......");
	}

	@Override
	public void speedDown() {
		System.out.println("LuxuryCar is speeding down.......");
	}
}
