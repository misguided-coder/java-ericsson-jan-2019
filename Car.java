class Car {
	
	int vin;
	int doors;
	int wheels;
	double price;
	String color;
	int speed;


	Car() {

	}	

	Car(int vin,int doors,int wheels,double price,String color,int speed) {
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

	void brake() {
		this.speed = this.speed - 10;
		System.out.println("Car is slowing down to the speed of "+this.speed+" km per hour!!!!");
	}		
}