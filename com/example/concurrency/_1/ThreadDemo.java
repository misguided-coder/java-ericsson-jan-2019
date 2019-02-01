package com.example.concurrency._1;

public class ThreadDemo {

	public static void main(String[] args) {

		// Task 1
		for (int i = 0; i < 10; i++) {
			System.out.printf("I : %s%n", i);
		}

		// Task 2
		for (int j = 0; j < 10; j++) {
			System.out.printf("J : %s%n", j);
		}

	}

}
