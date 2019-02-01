package com.example.ex;

/* 
 * Author : Mohan Singh
 * Date : 10st Mar 2019
 * Email : mohan@YAHOO.COM
 */
public class Manager {

	public static void main(String[] args) throws Exception {

		AccountService accountService = new AccountService();

		long accountNo = accountService.open("Pintu", 120000.00);
		System.out.printf("Account Number : %s%n", accountNo);

		double balance = accountService.withdraw(3000, 200000.00);
		System.out.printf("Available balance after withdrawl is %s%n", balance);

	}
}
