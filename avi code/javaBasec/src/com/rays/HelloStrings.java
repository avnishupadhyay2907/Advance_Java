package com.rays;

public class HelloStrings {
public static void main(String[] args) {
	
	String name = "Avnish" ;
	name = name.toLowerCase();
	char ch = 'A';
	int count = 0 ;
	
	for (int i = 0; i < name.length(); i++ ) {
		
		System.out.println(name.charAt(i));
		if (name.charAt(i)== ch) {
			count++ ;
		}
	}
	
	System.out.println(ch+"count = "+ count);
}
}
