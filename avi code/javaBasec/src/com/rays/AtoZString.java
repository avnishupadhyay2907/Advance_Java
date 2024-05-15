package com.rays;

public class AtoZString {

	public static void main(String[] args) {
		
		String Name = "Vijay Dinanath Chouhan";
		
		int count = 0;
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			
			for (int i = 0; i < Name.length(); i++) {
				
				if (Name.charAt(i) == ch) {
					
					count++;
				}
				
			}
			
			if (count!=0) {
				
				System.out.println(ch+ " count = " + count);
				count = 0;
			}
			
			
			
		}
		
	}
	
}
