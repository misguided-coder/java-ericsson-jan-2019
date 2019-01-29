class ArrayDemo {

	public static void main(String[] args) {

		//useCaseOne();
		//useCaseTwo();
		//useCaseThree();
		//useCaseFour();
		//useCaseFive();
		//useCaseSix();
		useCaseSeven();

		System.out.println("Finish Line");

	}

	static void useCaseSeven() {

		int[][] values = {{10,20},{10,20,34,50},{120,340}};
		
		System.out.println(values.length); //rows
		System.out.println(values[1].length); //first row length

	}

	static void useCaseSix() {

		int[][] values = new int[2][4];

		values[0][0] = 10;
		values[0][1] = 20;
		values[0][2] = 30;
		values[0][3] = 40;


		values[1][0] = 100;
		values[1][1] = 200;
		values[1][2] = 300;
		values[1][3] = 400;

		System.out.println(values[1][2]);
 
	}


	static void useCaseFive() {

		String password = "secret";
		
		System.out.println("Length : "+password.length());
		System.out.println(password);
	}


	static void useCaseFour() {

		char[] password = {'s','e','c','r','e','t'};
		
		System.out.println("Length : "+password.length);
		System.out.println(password);
	}


	static void useCaseThree() {

		//declaration & initializaton & population
		//int[] numbers = new int[]{90,78,12,34,56,23,21,35,76,89,99,87,65,34};
		int[] numbers = {90,78,12,34,56,23,21,35,76,89,99,87,65,34};
		
		System.out.println("Length : "+numbers.length);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[9]);

		System.out.println(numbers[5]);

	}



	static void useCaseTwo() {

		//declaration & initializaton
		int[] numbers = new int[10];
		
		//population
		numbers[0] = 100;
		numbers[5] = 200;
		numbers[9] = 300;
		
		System.out.println(numbers.length);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[9]);

		System.out.println(numbers[5]);

	}


	static void useCaseOne() {

		//declaration
		int[] numbers;

		//initializaton
		numbers = new int[10];
		
		//population
		numbers[0] = 100;
		numbers[5] = 200;
		numbers[9] = 300;
		
		System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[9]);

		System.out.println(numbers[5]);

	}


}