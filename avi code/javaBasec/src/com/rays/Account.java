package com.rays;

public class Account {

	private int balance;	
	
	public void setBalance(int balance) {
		this.balance = balance;
		
	}

	public int getBalance() {
		return balance;
	}
	
	public void deposite(int amount) {
		balance = balance+= amount ;
		
		System.out.println("balance = "+ balance );
		
	}
	public void withdrawl (int amount ) {
	if (balance - amount >= 10000) {
		
	
		balance = balance - amount;
		System.out.println("balance = " + balance );
	} else {
		System.out.println("Insufficient balance..");
	}
	}
}
