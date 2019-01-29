package com.example.modifiers;

public class Student {

	//instance level fields
	String name;
	int hindiMarks;
	
	//class level fields
	static final int marks = 100; 
	
	public Student(String name, int hindiMarks) {
		this.name = name;
		this.hindiMarks = hindiMarks;
	}
}
