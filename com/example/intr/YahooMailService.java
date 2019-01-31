package com.example.intr;

public class YahooMailService implements EmailService {

	String mailServer = "yahoo.smtp.server";
	
	@Override
	public boolean configure() {
		//20 loc
		return true;
	}
	
	@Override
	public boolean send() {
		System.out.printf("Yahoo Mail Server has sent mail using server : %s%n",this.mailServer);
		return true;
	}

	@Override
	public void receive() {
		System.out.printf("Yahoo Mail Server has received mail using server : %s%n",this.mailServer);
	}	
}
