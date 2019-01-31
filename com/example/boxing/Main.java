package com.example.boxing;

public class Main {

	public static void main(String[] args) {
		
		int i = 10;		
		Integer it = new Integer(i); //explicit boxing 
		
		int j = 10;
		Integer x = j; //auto boxing since Java 5
		
		int y = it.intValue();  //explicit unboxing 
		
		int z = it;  //auto unboxing since Java 5
		
		Integer a = new Integer(10); 
		Integer b = new Integer(10); 
		
		System.out.println(a.intValue()+b.intValue());
		System.out.println(a+b);
					
	}
}
