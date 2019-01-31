package com.example.exercise;

public class Car extends Automobile implements Acceleratable,Repairable {

	@Override
	public void canStart() {
		System.out.println("Car can be started by using key!!!!");
	}

	@Override
	public void canRepair() {
		System.out.println("Car can be repaired!!!");
	}

	@Override
	public void speedUp() {
		System.out.println("Car is speeding up.......");
	}
	
	
	
}
