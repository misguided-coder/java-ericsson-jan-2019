package com.example.modifiers;

public class StudentDemo {
	public static void main(String[] args) {
		
		System.out.println(Student.marks);
	
		
		Student s1 = new Student("Pintu", 40);
		Student s2 = new Student("Jaggu", 46);
		Student s3 = new Student("Ghanshu", 30);
		Student s4 = new Student("Shyam", 90);
		
		
		System.out.println(s1.marks);
		System.out.println(s1.name);
		
		System.out.println(s2.marks);
		System.out.println(s3.marks);
		System.out.println(s4.marks);
		System.out.println(Student.marks);
		
		//Student.marks = 500;
			
		System.out.println(s1.marks);
		
	}

}
