package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteCustomerDetails {
	public static void main(String[] args) {
		try {
			Class.forName ("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "313Ashu@");
			Statement statement = connection.createStatement();
			int count=statement.executeUpdate("delete from customer_details where CID=1");
			
			System.out.println(count);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			}
	

}