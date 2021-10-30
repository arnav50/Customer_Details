package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ReteriveData {
	 public static void main(String[] args) {
	        Connection connection = null;
	        Statement statement = null;
	        int count = 0;
	        try {
	            connection =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "313Ashu@");
	            statement = connection.createStatement();
	            statement.executeUpdate("select * from customer_details");
	            System.out.println(count);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }finally {
	            try {
	                statement.close();
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


