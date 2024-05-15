package com.rays;

public class TestAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Account a = new Account ();
		
		a.setBalance(1000000);
		
		System.out.println(a.getBalance());
		
		a.deposite(15008956);
		a.withdrawl (16000);
		
		
	}
	
}
