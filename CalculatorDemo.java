class CalculatorDemo {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
	
		calculator.sum(10,5);
		calculator.sum(10,5L);
		calculator.sum(10,5,10);
		calculator.sum(10,100.50);
		calculator.sum(10,100.50F);

		System.out.println("Finish Line!!!!!");

	}

}