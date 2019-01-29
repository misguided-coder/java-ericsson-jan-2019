package com.example.modifiers;

public abstract class Shape {
	
	String size= "10x6";
	
	public void info() {
		System.out.println("It is all about shapes!!!");
	}

	public abstract void draw();
	public abstract void paint();
}
