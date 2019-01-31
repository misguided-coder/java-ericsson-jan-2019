package com.example.modifiers;

public abstract class Shape {
	
	String size= "10x6";
	
	public Shape() {
		
	}

	public Shape(String size) {
		this.size = size;
	}

	public void info() {
		System.out.println("It is all about shapes!!!");
	}

	public abstract void draw();
	public abstract void paint();
}
