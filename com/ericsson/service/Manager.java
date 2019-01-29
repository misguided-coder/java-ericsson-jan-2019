package com.ericsson.service;

class Manager {

	public static void main(String[] args) {
		
		AccountService accountService = new AccountService();
		System.out.println(accountService.id);
		System.out.println(accountService.balance);
	
		SavingAccountService savingAccountService = new SavingAccountService();
		System.out.println(savingAccountService.id);
		System.out.println(savingAccountService.balance);
	}
}
