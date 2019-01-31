package com.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	static List list = new ArrayList();

	public static void main(String[] args) {
		addIntoList();
		addIntoListEasy();
		readFromList1();
		//readFromList2();
		//readFromList3();
		//readFromList4();
		//changeValueIntoList();
		//removeFromList();
		//readFromList5();
	}

	
	private static void removeFromList() {
		System.out.println(list);
		list.remove(2);
		list.remove("Ritesh");
		System.out.println(list);
	}

	
	private static void changeValueIntoList() {
		list.set(0, "Rohan");
	}

	//Java 8
	private static void readFromList5() {
		//list.forEach((val)->{System.out.println(val);});
		list.forEach(System.out::println);
	}

	
	//Java 5
	private static void readFromList4() {
		
		for(Object element : list) {
			System.out.println(element);
		}

	}


	//Java 2
	private static void readFromList3() {
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}

	}

	//Old is gold
	private static void readFromList2() {
		
		for(int idx=0;idx<list.size();idx++) {
			Object obj = list.get(idx);
			System.out.println(obj);
		}
	
	}


	private static void readFromList1() {

		Object obj = list.get(0);
		
		
		if(obj instanceof String) {
			//Display data
			System.out.println(obj);
		}else if(obj instanceof Integer){
			//Do some math calculations on retrieved value
			Integer value = (Integer) obj;
			System.out.println(value/10);
		}
		
		
	
		obj = list.get(12);
		System.out.println(obj);
	}
	
	//Java 5 auto boxing
	private static void addIntoListEasy() {

		list.add("Mohan");
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(true);
		list.add(new Car());
		list.add(200);
		list.add(1000); 
		list.add("Ritesh"); 
		list.add(890.56); 
				
		System.out.printf("Length : %s%n", list.size());

	}

	private static void addIntoList() {

		list.add("Sohan");
		Integer i = new Integer(100);
		list.add(i);
		Integer x = new Integer(200);
		list.add(x);
		System.out.printf("Length : %s%n", list.size());
		Boolean y = new Boolean(true);
		list.add(y);
		System.out.printf("Length : %s%n", list.size());

		Car car = new Car();
		list.add(car);

		System.out.printf("Length : %s%n", list.size());

		list.add(new Car());

		System.out.printf("Length : %s%n", list.size());

		list.add(new Integer(200));

		System.out.printf("Length : %s%n", list.size());

		int a = 1000;
		list.add(a); // Java 5 onwards

		System.out.printf("Length : %s%n", list.size());

	}
}
