package com.rays.Test;

import java.util.ResourceBundle;

public class TestHi {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.hi");
		
		System.out.println(rb.getString("greeting"));
		
		
		
		
	}
	
}
