package com.example.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<String> colors = new TreeSet<>();
		
		colors.add("Yellow"); 
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("MARA");
		colors.add("Green");
		colors.add("RAMA");

		System.out.println(colors);	
		
		for(String color : colors) {
			System.out.println(color);
		}
		
		
		Iterator<String> iterator = colors.iterator();
		while(iterator.hasNext()) {
			String color = iterator.next();
			System.out.println(color);
		}
		
	}

}
