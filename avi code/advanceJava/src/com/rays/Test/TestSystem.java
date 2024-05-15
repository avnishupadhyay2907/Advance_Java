package com.rays.Test;

import java.util.ResourceBundle;

public class TestSystem {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.system");
		
		System.out.println(rb.getString("Driver"));
		System.out.println(rb.getString("url"));
		System.out.println(rb.getString("username"));
		System.out.println(rb.getString("password"));
		
		
	}
	
}
