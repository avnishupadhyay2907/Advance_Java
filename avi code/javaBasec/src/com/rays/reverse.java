package com.rays;

public class reverse {
	      
	public static void main(String[] args) {
		
		String name = "Avnish Upadhyay";
		
		printNameFromEnd(name);
	}

	public  static void printNameFromEnd(String name) {
		
		char [] charArray = name.toCharArray();
		


		for (int i = charArray.length -1; i >=0; i--) {
			System.out.println(charArray[i]);	
			}		
		
		
		
	
	}
	
}
