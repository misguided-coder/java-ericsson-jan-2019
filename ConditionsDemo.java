class ConditionsDemo {

	public static void main(String[] args) {

		useCaseOne();
		useCaseTwo();
		//useCaseThree();
		
		System.out.println("Finish Line");

	}

	static void useCaseThree() {
	}



	static void useCaseTwo() {
		
		String color = "Black";
		
		switch(color) {
			case "Red" :
				System.out.println("My car color is Red");
				break;
			case "Blue" :
				System.out.println("My car color is Blue");
				break;
			case "Black" :
				System.out.println("My car color is Black");
				break;
			default :
				System.out.println("My car color is White");
				break;
		}

				
	}


	static void useCaseOne() {

		int age = 11;
		
		if(age <= 12) {
			System.out.println("You are too young for the movie, go home!!!!");
		} else {
			System.out.println("Enjoy movie with popcorn!!!!");
		}		
	}


}