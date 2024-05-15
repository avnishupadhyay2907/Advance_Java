package com.rays.oop.withoutcounstructor;

public class TestShape {
public static void main(String[] args) {
	Shape [] s = new Shape [3];
	s[0] = new Rectangle ();
	s[1] = new Circle  ();
	s[2] = new Triangle ();
	Rectangle r = (Rectangle) s [0] ;
	r.setLength(45);
	r.setWidth(7);
	Circle c = (Circle) s[1] ;
	c.setRadius(10);
	Triangle t = (Triangle) s[2];
	t.setBase(20);
	t.setHeight(10);
	for (int i = 0; i < s.length; i++) {
		s[i].area();
	}
	
}
}
