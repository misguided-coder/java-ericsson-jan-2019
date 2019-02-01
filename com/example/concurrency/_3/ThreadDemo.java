package com.example.concurrency._3;

public class ThreadDemo {

	public static void main(String[] args) {

		TaskA taskA = new TaskA();
		TaskB taskB = new TaskB();

		Thread workerA = new Thread(taskA);
		Thread workerB = new Thread(taskB);
		
		workerA.start();
		workerB.start();
	}

}

class TaskA implements Runnable {

	public void run() {

		// Task 1
		for (int i = 0; i < 100; i++) {
			System.out.printf("I : %s%n", i);
		}
	}
}

class TaskB implements Runnable {

	public void run() {

		// Task 2
		for (int j = 0; j < 100; j++) {
			System.out.printf("J : %s%n", j);
		}
	}
}
