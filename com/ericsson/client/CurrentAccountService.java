package com.ericsson.client;

import com.ericsson.service.AccountService;

public class CurrentAccountService extends AccountService {
	
	void open() {
		System.out.println("Accout is opened with "+this.id+" and current balance is : "+this.balance);
	}
}
