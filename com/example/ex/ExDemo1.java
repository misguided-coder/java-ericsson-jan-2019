package com.example.ex;

public class ExDemo1 {

	public static void main(String[] args) {

		//200 loc
		System.out.println("Work started!!!!");
		
		try {

			Integer it = null;
			int x = it.intValue();
			System.out.println(x);

			int[] arr = new int[2];
			arr[0] = 1000;
			arr[1] = 2000;
			// arr[2] = 3000;

			System.out.println(arr);

			int i = 10;
			int j = 0;
			int rs = i / j;

			System.out.printf("Result: %s%n", rs);
		} catch (ArithmeticException exception) {
			System.out.println("ArithmeticException handled properly!!!!");
			System.out.println(exception.getMessage());
			// exception.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("ArrayIndexOutOfBoundsException handled properly!!!!");
			System.out.println(exception.getMessage());
			// exception.printStackTrace();
		} catch (Exception exception) {
			System.out.println("Global Exception handled properly!!!!");
			System.out.println(exception.getMessage());
			// exception.printStackTrace();
		} finally {
			System.out.println("I am the boss, you have to pay here!!!!");
		}

		// 1000 loc
		System.out.println("Finish Line");
	}

}
