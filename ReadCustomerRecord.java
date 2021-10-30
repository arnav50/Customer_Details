package com.greycampus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ReadCustomerRecord {
	public ArrayList<CustomerDetails> getAllData() {

		Connection connection = null;
		Statement createStatement = null;
		ResultSet resultSet = null;
		ArrayList<CustomerDetails> customerList = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "313Ashu@");
			createStatement = connection.createStatement();
			resultSet = createStatement.executeQuery("select * from customer_details");
			customerList = new ArrayList<CustomerDetails>();
			while (resultSet.next()) {
				CustomerDetails Customerdetails = new CustomerDetails();
				Customerdetails.setCid(resultSet.getInt("cid"));
				Customerdetails.setFristname(resultSet.getString("firtname"));
				Customerdetails.setLastname(resultSet.getString("lastname"));
				Customerdetails.setStreet(resultSet.getString("street"));
				Customerdetails.setCity(resultSet.getString("city"));
				Customerdetails.setState(resultSet.getString("state"));
				Customerdetails.setZipcode(resultSet.getInt("zipcode"));
				Customerdetails.setProdut_name(resultSet.getString("product_name"));
				Customerdetails.setCreated_on(resultSet.getDate("created_on"));
				Customerdetails.setCreated_by(resultSet.getString("created_by"));
				Customerdetails.setUpdated_on(resultSet.getDate("updated_on"));
				Customerdetails.setUpdated_by(resultSet.getString("updated_by"));
				
				customerList.add(Customerdetails);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				createStatement.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				resultSet.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
		return customerList;
	}
}


