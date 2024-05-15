package com.rays.stat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcadvance", "root", "root");

		System.out.println("connection successfully...");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate(
				"insert into user values(2,'ravi','sharma','ravi001@gmail.com','pass@123','2000-02-21','indore')");

		System.out.println("Data inserted successfully..." + i);

	}

}
