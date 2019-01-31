package com.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class GenericsDemo {
	

	public static void main(String[] args) {
			
			List<Integer> values = new ArrayList<>();
			
			values.add(new Integer(10));
			values.add(20);
			values.add(30);
			values.add(40);
				
			Integer value1 = values.get(0);
			System.out.println(value1);
			
			int val = values.get(0);
			System.out.println(val);
			
			Iterator<Integer> iterator = values.iterator();
			while(iterator.hasNext()) {
				int value = iterator.next();
				System.out.println(value);
			}

			System.out.println("====================");
			
			
			for(Integer value : values) {
				System.out.println(value);
			}

			System.out.println("====================");
			
			for(int value : values) {
				System.out.println(value);
			}

	}
	
}
