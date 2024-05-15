package com.rays;

public class TestAutomobile {

public static void main(String[] args) {
	
	Automobile auto = new Automobile ();
	auto.setColour("Red");
	System.out.println(  "Veichle Colour :- "+auto.getColour());
	auto.setSpeed(260);
	System.out.println( "Top Speed :- "+auto.getSpeed());
	auto.setMake("Steel, " + "Fiber, "+ "Chrome, "+ "Tyre");
	System.out.println(  "Material Used To Make :- "+auto.getMake());
	
	
}	
	
}
