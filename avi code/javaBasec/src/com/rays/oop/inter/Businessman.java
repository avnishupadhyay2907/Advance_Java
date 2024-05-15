package com.rays.oop.inter;

public class Businessman implements Richman, SocialWorker {

	@Override
	public void earnMoney() {
		System.out.println("earnMoney");
	}

	@Override
	public void donation() {
		System.out.println("donation");
	}

	@Override
	public void party() {
		System.out.println("party");
	}

	public void abc() {
		System.out.println("abc");
	}

	

	@Override
	public void helpToOther() {
		// TODO Auto-generated method stub
		
	}

}

