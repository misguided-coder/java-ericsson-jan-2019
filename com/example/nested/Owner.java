package com.example.nested;

public class Owner {

	static public String name = "Pintu";
	String city= "Gurugram";
	private int electricityLoad = 5; //KW
		
	void info() {
		System.out.printf("Name : %s and City : %s.%n",this.name,this.city);
		System.out.printf("Electricity Usage Load is %s KW.%n",this.electricityLoad);
	}
	
	
	public class Tenant {
		
		String name = "Jaggu";
		int age = 20;
	
		void info() {
			System.out.printf("Name : %s and Age: %s.%n",this.name,this.age);
		}
		
		void useElectricity() {
			System.out.printf("Electricity used by tenant is : %s",electricityLoad*.20);
		}
	}
	
}
