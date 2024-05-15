package com.rays;

public class SecondHighest {

	public static void main(String[] args) {
		
		int [] arr = { 100,1,87,5,6,4,56,};
		
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>max) {
				
				min = max;
				
				
			}
			
			if (arr [i]<max && arr[i] >min) {
				
				min = arr[i];
				
			}
			
		}
	
		System.out.println("Min=" + min);
		System.out.println("Max=" + max);
	}
	
}
