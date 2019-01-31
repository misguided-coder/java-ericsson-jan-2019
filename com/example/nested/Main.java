package com.example.nested;

public class Main {

	public static void main(String[] args) {
		
		Owner owner = new Owner();
		owner.info();
		
		Owner.Tenant tenant =  owner.new Tenant();
		tenant.info();
		tenant.useElectricity();
		
		//System.out.println(owner.electricityLoad);
	}
}
