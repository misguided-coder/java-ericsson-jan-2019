package com.example.concurrency._2;

public class ThreadDemo {

	public static void main(String[] args) {
		
		TaskA taskA = new TaskA();
		TaskB taskB = new TaskB();
		
		taskA.doWork();
		taskB.doWork();
	}

}

class TaskA {

	public void doWork() {

		// Task 1
		for (int i = 0; i < 10; i++) {
			System.out.printf("I : %s%n", i);
		}
	}
}

class TaskB {

	public void doWork() {

		// Task 2
		for (int j = 0; j < 10; j++) {
			System.out.printf("J : %s%n", j);
		}
	}
}
