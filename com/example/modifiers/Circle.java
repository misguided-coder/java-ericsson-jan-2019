package com.example.modifiers;

public class Circle extends Shape {
	
	public Circle() {
		super("8x6");
	}

	public void draw() {
		System.out.printf("Circle is drawn with size %s!!!!%n",this.size);
	}
	
	public void paint() {
		System.out.println("Circle is painted!!!!");
	}
	
}
