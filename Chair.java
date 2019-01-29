class Chair extends Furniture {
	
	int hands;
	int legs;
	String material = "Wood";
	
	Chair() {
		super(1,"Wood",14000.00);
		System.out.println("Inside Chair() constructor!!!!!");
	}

	Chair(int id,String material,double price) {
		super(id,material,price);
		System.out.println("Inside Chair(int id,String material,double price) constructor!!!!!");
	}

	Chair(int id,String material,double price,int hands,int legs) {
		super(id,material,price);
		this.hands = hands;
		this.legs = legs;

		System.out.println("Inside Chair(int id,String material,double price,int hands,int legs) constructor!!!!!");
	}

	void info() {
		super.info();
		System.out.println("Chair Details : ");
		System.out.println("Hands : "+this.hands);
		System.out.println("Legs : "+this.legs);
	}

	@Override
	void paint() {
		System.out.println("Chair painted by hand colors!!!");
	}

}