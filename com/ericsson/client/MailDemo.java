package com.ericsson.client;

import com.ericsson.service.EmailService;

class MailDemo {

	public static void main(String[] args) {
		
		EmailService emailService = new EmailService();
		emailService.send();
		//emailService.configure();
		
		System.out.println(emailService.to);
	}
}
