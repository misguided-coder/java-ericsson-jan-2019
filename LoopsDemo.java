class LoopsDemo {

	public static void main(String[] args) {

		//useCaseOne();
		//useCaseTwo();
		useCaseThree();
		
		System.out.println("Finish Line");

	}

	static void useCaseThree() {

		for(int idx = 0;idx <= 10;idx = idx +1) {
			System.out.println(idx);
		}
	}



	static void useCaseTwo() {
		
		int idx = 50;			

		do {
			System.out.println(idx);
			//50 loc 
			idx = idx + 2;
		}while(idx <= 10);
				
	}


	static void useCaseOne() {

		int idx = 0;			

		while(idx <= 10) {
			System.out.println(idx);
			//50 loc 
			idx = idx + 2;
		}
	}


}