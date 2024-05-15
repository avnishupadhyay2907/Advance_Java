package com.rays.java;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s = new Shape (); 
		s.area();
		Rectangle r = new Rectangle();
		r.area();
		r.setColor( "Shape Color = "+"Red");
		System.out.println(r.getColor());
		Shape shape = new Rectangle ();
		Rectangle rectangle = (Rectangle) shape ;
		rectangle.setLength(1589);
		rectangle.setWidth(4589);
		shape.area();
	}	
}
