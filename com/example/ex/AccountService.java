package com.example.ex;

/* A business class used for providing
 *  core banking functionalities.
 * */
/*
 * Author : Ritesh Tyagi
 * Date : 1st Feb 2019
 * Email : HI2TYAGI@YAHOO.COM
 */
public class AccountService {
	
	double balance;

	public long open(String name, double initialBalance) throws InitialBalanceException {
		if (initialBalance <= 10000.00) {
			throw new InitialBalanceException("Initial Balance can not be less then Rs/- 10000.00!!!");
		}
		System.out.printf("Hello Mr. %s, your account is opened.%n", name);
		this.balance = initialBalance;
		return (long)(Math.random()*5000);
	}

	
	public boolean close(long accountNo) throws AccountDoesNotExistException {
		if (accountNo >= 1 || accountNo <= 5000) {
			System.out.printf("Account ' %s ' is closed.%n", accountNo);
			return true;
		}
		throw new AccountDoesNotExistException("Account '"+accountNo+"'does not exist.");
	}

	public double withdraw(long accountNo,double amount) throws AccountDoesNotExistException,InsufficientFundsException {
		if (accountNo <= 0 || accountNo > 5000) {
			throw new AccountDoesNotExistException("Account '"+accountNo+"'does not exist.");
		}
		if (amount > this.balance) {
			throw new InsufficientFundsException("Account '"+accountNo+"' has only "+this.balance);
		}
		this.balance = this.balance - amount;
		return this.balance;
	}


}
