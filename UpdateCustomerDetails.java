package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class UpdateCustomerDetails {
	 public static void main(String[] args) {
	        Calendar calendar = Calendar.getInstance();
	        java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());

	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        int count = 0;
	        try {
	            String sql = "update customer_details set firstname = ?,lastname = ?,street = ?,city = ?,state = ?,zipcode = ?,product_name = ?,created_on = ?,created_by = ?,updated_on = ?,updated_by = ? where cid = ? ";
	            connection =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "313Ashu@");
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1,"Robin");
	            preparedStatement.setString(2,"hood");
	            preparedStatement.setString(3,"balgal vali gali");
	            preparedStatement.setString(4,"punjab");
	            preparedStatement.setString(5,"India");
	            preparedStatement.setInt(6,201301);
	            preparedStatement.setString(7,"Data update Project");
	            preparedStatement.setDate(8,ourJavaDateObject);
	            preparedStatement.setString(9,"xyz");
	            preparedStatement.setDate(10,ourJavaDateObject);
	            preparedStatement.setString(11,"agc");
	            preparedStatement.setInt(12,1);
	            count = preparedStatement.executeUpdate();
	            System.out.println(count);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }finally {
	            try {
	                preparedStatement.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            try {
	                connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

