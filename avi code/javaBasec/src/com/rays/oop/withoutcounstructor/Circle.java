package com.rays.oop.withoutcounstructor;

public class Circle extends Shape{
private int radius ;
public static final double PI = 3.14;
public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
public static double getPi() {
	return PI;
}
public double area () {
	double cArea = PI * radius * radius ;
	System.out.println("Circle Area = "+ cArea);
	return cArea;
}
}
