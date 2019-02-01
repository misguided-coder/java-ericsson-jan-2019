package com.example.concurrency._4;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadDemo {

	public static void main(String[] args) {

		Executor executor = Executors.newFixedThreadPool(10);

		executor.execute(new TaskA());
		executor.execute(new TaskB());

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
