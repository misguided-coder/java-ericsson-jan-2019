class Car {
	
	int vin;
	int doors;
	int wheels;
	double price;
	String color;
	int speed;

	//default constructor
	Car() {
		System.out.println("Inside Car() constructor!!!!");
		this.vin = 1000;
		this.doors = 2;
		this.wheels = 4;
		this.price = 560000.00;
		this.color = "Black";
		this.speed = 160;
	}	

	//parameterized constructor
	Car(int vin,int doors,int wheels,double price,String color,int speed) {
		System.out.println("Inside Car(int vin,int doors,int wheels,double price,String color,int speed) constructor!!!!");
		this.vin = vin;
		this.doors = doors;
		this.wheels = wheels;
		this.price = price;
		this.color = color;
		this.speed = speed;
	}

	void start() {
		System.out.println("Car started!!!!");
	}		

	void stop() {
		System.out.println("Car stopped!!!!");
	}		

	void accelerate() {
		this.speed = this.speed + 10;
		System.out.println("Car is speeding up at the speed of "+this.speed+" km per hour!!!!");
	}		

	void brake(int appliedSpeed) {
		this.speed = this.speed - appliedSpeed;
		System.out.println("Car is slowing down to the speed of "+this.speed+" km per hour!!!!");
	}		
}