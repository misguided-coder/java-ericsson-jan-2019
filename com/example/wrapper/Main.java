package com.example.wrapper;

public class Main {
	
	public static void main(String[] args) {
		
		Integer it = new Integer(1000);
		System.out.println(it);
		
		int x= it.intValue();
		
		System.out.println(x);
		
		
		int i = 1000;
		System.out.println(i);
		
		byte b = 10;
		Byte val = new Byte(b);
		
		val.byteValue();
		
		Character ch = new Character('Z');
		char c = 'Z';
		
		ch.charValue();
		
		
	}

}
