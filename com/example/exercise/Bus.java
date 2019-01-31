package com.example.exercise;

public class Bus extends Automobile implements Repairable {

	@Override
	public void canStart() {
		System.out.println("Bus can start with key less!!!!");
	}

	@Override
	public void canRepair() {
		System.out.println("LuxuryCar can be repaired!!!");
	}
}
