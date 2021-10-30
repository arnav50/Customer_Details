package com.greycampus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertCustomerDetail {
	public static java.sql.Date getCurrentDate() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Date(today.getTime());
	}
		
public static void main(String[] args) {
	
				Connection connection = null;
				PreparedStatement prepareStatement = null;
				
				try {
					connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "313Ashu@");
					prepareStatement = connection.prepareStatement("insert into customer_details values(?,?,?,?,?,?,?,?,?,?,?,?)");
					prepareStatement.setInt(1, 1);
					prepareStatement.setString(2, "Rohit");
					prepareStatement.setString(3, "Thakur");
					prepareStatement.setString(4, "near chor bazar");
					prepareStatement.setString(5, "Delhi");
					prepareStatement.setString(6, "Delhi");
					prepareStatement.setInt(7, 175024);
					prepareStatement.setString(8, "IPhone13Pro");
					prepareStatement.setDate(9, getCurrentDate());
					prepareStatement.setString(10, "cvz");
					prepareStatement.setDate(11, getCurrentDate());
					prepareStatement.setString(12, "dfg");
					
					prepareStatement.executeUpdate();
					
				} catch (SQLException e) {

					e.printStackTrace();
				} finally {
					try {
						connection.close();
					} catch (SQLException e) {

						e.printStackTrace();
					}
					try {
						prepareStatement.close();
					} catch (SQLException e) {

						e.printStackTrace();
					}

				}				
				
			}

	}


