package com.example;

public class TypeCastDemo {
	
	public static void main(String[] args) {
		//UC1();
		//UC2();
		UC3();
	}
	
	
	static void UC3() {
			
			LuxuryCar car1 = new LuxuryCar();
		
			Car car2 = car1;
			
			LuxuryCar car3 = (LuxuryCar) car2;
			
			System.out.println(car1);
			System.out.println(car2);
			System.out.println(car3);
			
			
			car3.canStart();
			car3.canStop();
			car3.speedUp();
			
			
		}

	
	//type casting rules for custom/user defined types
	static void UC2() {
		
		Car car = new LuxuryCar();
		
		car.canStart();
		
		car.canStop();
		//car.speedUp();
		
	}
	
	//type casting rules for primitive/built-in types
	static void UC1() {
		
		int i = 10;
		long j = i; //implicit casting
		
		System.out.println(i);
		System.out.println(j);
		
		long x = 999999000; 
		int y = (int) x; //explicit casting
		
		System.out.println(x);
		System.out.println(y);
		
		float f = 1000.60F;
		double d = f;
		
		System.out.println(f);
		System.out.println(d);
	
		double salary = 127800.00;
		float smallSalary = (float)salary;
		
		System.out.println(salary);
		System.out.println(smallSalary);
	
		char ch = 'a';
		int val = ch;
	
		System.out.println(ch);
		System.out.println(val);

	}

}
