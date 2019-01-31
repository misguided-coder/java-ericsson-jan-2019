package com.example.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		//demoOne();
		demoTwo();
	}

	
	private static void demoTwo() {
		
		LinkedList<String> colors = new LinkedList<>();

		colors.addLast("Yellow"); //add at the tail
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Red");
			
		System.out.println(colors);
		
		colors.removeFirst(); //remove head of the list

		System.out.println(colors);
	
	}

	
	private static void demoOne() {
		
		List<String> colors = new LinkedList<>();

		colors.add("Yellow");
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Red");
			
		System.out.println(colors);
		
		String value = colors.get(2);
		System.out.println(value);
		
		for(String color : colors) {
			System.out.println(color);
		}
	}

}
