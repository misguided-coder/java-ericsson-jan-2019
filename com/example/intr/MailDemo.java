package com.example.intr;

public class MailDemo {

	public static void main(String[] args) {
		
		//GoogleMailService googleMailService = new GoogleMailService();
		
		EmailService googleMailService = new GoogleMailService();
	
		googleMailService.send();
		googleMailService.receive();
		
		//YahooMailService yahooMailService = new YahooMailService();
		EmailService yahooMailService = new YahooMailService();
		
		yahooMailService.send();
		yahooMailService.receive();
		
		
	}
}
