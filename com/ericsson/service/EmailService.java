package com.ericsson.service;

public class EmailService {

	private String from = "admin@gmail.com";
	public String to = "obama@gmail.com";
		
	public EmailService() {
	}
	
	public void send() {
		configure();
		System.out.println("Email is sent!!!!!");
	}

	private void configure() {
		System.out.println("Email System is being configured, wait............");
	}

}
