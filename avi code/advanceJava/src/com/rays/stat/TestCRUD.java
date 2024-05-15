package com.rays.stat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCRUD {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcadvance", "root", "root");

		System.out.println("connection successfully...");

		add();
		// update();
		// delete();
		// search();
		// findById();
		// findByFirstName();
		// findByLoginId();
		// authenticate();

	}

	private static void authenticate() {
		// TODO Auto-generated method stub

	}

	private static void findByLoginId() {
		// TODO Auto-generated method stub

	}

	private static void findByFirstName() {
		// TODO Auto-generated method stub

	}

	private static void findById() {
		// TODO Auto-generated method stub

	}

	private static void search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcadvance", "root", "root");

		System.out.println("connection done successfully....");

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("select * from user");

		while (rs.next()) {

			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getString(5));
			System.out.print("\t" + rs.getDate(6));
			System.out.println("\t" + rs.getString(7));

		}

	}

	private static void delete() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcadvance", "root", "root");

		System.out.println("connection successfully...");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("delete from user where id = 4");

		System.out.println("Data Deleted Successfully..." + i);

	}

	private static void update() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcadvance", "root", "root");

		System.out.println("connection successfully...");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("update user set password = 'pass@123' where id = 2");

		System.out.println("Data Updated Successfully.." + i);

	}

	private static void add() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcadvance", "root", "root");

		System.out.println("connection successfully...");

		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate(
				"insert into user values(4, 'krishna', 'agnihotri', 'krishna23@gmail.com', 'pass@123', '2000-04-07', 'pune')");
		System.out.println("Data Added Successfully..." + i);

	}

}