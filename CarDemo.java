class CarDemo {

	public static void main(String[] args) {

		Car c1 = null; //10
		c1 = new Car(); //11
		//12
				
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car(2000,4,4,15000.00,"Red",80);
		Car car4 = car3;
		Car car5 = car4;

		System.out.println(car1.vin);
		System.out.println(car1.doors);
		System.out.println("============================");

		car1.vin = 5000;
		System.out.println(car1.vin);

		System.out.println(car2.vin);
		System.out.println(car2.doors);
		System.out.println("============================");

		System.out.println(car3.vin);
		System.out.println(car3.doors);
		System.out.println("============================");

		car4.color = "Blue";
		System.out.println(car3.color);
		System.out.println(car4.color);
 		
		car3.start();
		
		car3.accelerate();
		car3.accelerate();
		car3.accelerate();
		car3.accelerate();

		car4.accelerate();
	
		car3.brake(15);
		car3.brake(25);

		car3.stop();

		System.out.println("Finish Line!!!!!");

	}

}