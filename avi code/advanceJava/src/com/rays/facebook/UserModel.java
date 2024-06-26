package com.rays.facebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserModel {

	public int nextPk() throws Exception {

		int pk = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebookusers", "root", "root");

		PreparedStatement ps = conn.prepareStatement("Select Max (id)From user");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);
			System.out.println("Max ID " + pk);

		}
		return pk + 1;

	}

	public void add(UserBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebookusers", "root", "root");

		System.out.println("connection successfully...");

		PreparedStatement ps = conn.prepareStatement("Insert Into user Values(?,?,?,?,?)");

		ps.setInt(1, nextPk());
		ps.setString(2, bean.getLoginId());
		ps.setString(3, bean.getPassword());
		ps.setString(4, bean.getUserName());
		ps.setInt(5, bean.getPhoneNumber());

		ps.executeUpdate();

		System.out.println("Data Inserted Successfully");

	}

}
