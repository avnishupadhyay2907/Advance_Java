package com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPersonee {

	public static void main(String[] args) throws ParseException {
		
		Person p = new Person ();
		p.setName("Avnish Upadhyay");
		System.out.println(p.getName());
		p.setAddress("22 A Ratan Bagh Colony Aerodram Road");
		System.out.println(p.getAddress());
		String s ="29-01-2007";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sdf.parse(s);
		p.setDob(d);
		System.out.println(p.getDob());
	}
	
}
