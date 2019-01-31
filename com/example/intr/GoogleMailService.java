package com.example.intr;

public class GoogleMailService implements EmailService {

	String mailServer = "gmail.smtp.server";
	
	@Override
	public boolean configure() {
		return true;
	}
	
	@Override
	public boolean send() {
		System.out.printf("Google Mail Server has sent mail using server : %s%n",this.mailServer);
		return true;
	}

	@Override
	public void receive() {
		System.out.printf("Google Mail Server has received mail using server : %s%n",this.mailServer);
	}	
}
