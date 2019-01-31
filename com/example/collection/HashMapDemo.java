package com.example.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {

		//Map<Integer, String> employees = new HashMap<>();
		Map<Integer, String> employees = new TreeMap<>();

		employees.put(10001, "Jaggu"); 
		employees.put(10005, "Rohan");
		employees.put(10004, "Chandu");
		employees.put(10002, "Pintu");
		employees.put(10003, "Ghanshu");

		System.out.println(employees);

		employees.put(10004, "Mohan");
		employees.put(40001, "Singh");

		System.out.println(employees);

		System.out.println(employees.get(40001));

		employees.remove(10005);

		System.out.println(employees);

		Set<Integer> keys = employees.keySet();

		System.out.println(keys);

		for(int key : keys) {
			String name = employees.get(key);
			System.out.println(name);
		}
		
		
		Collection<String> names = employees.values();
		
		System.out.println(names);
		
		for(String name : names) {
			System.out.println(name);
		}
		
		
		Set<Entry<Integer, String>> entries = employees.entrySet();
		System.out.println(entries);
		
		
		for(Entry entry : entries) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
