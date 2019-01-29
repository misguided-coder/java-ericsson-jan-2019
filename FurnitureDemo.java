class FurnitureDemo {

	public static void main(String[] args) {
			
		Chair chair = new Chair();
	
		//chair.price = 120000.00; 

		System.out.println(chair.id);
		System.out.println(chair.material);
		System.out.println(chair.price);
		System.out.println(chair.hands);
		System.out.println(chair.legs);

		chair.sell();

		Chair chair1 = new Chair(2,"Plastic",120.00,2,2);
		chair1.sell();

		chair1.info();

		chair1.paint();
		
		System.out.println("Finish Line");

	}
}