package com.greycampus;

import java.util.ArrayList;

public class DisplayCustomerData {
	
	public static void main(String[] args) {

		ReadCustomerRecord readRecords = new ReadCustomerRecord();
		ArrayList<CustomerDetails> customerData = readRecords.getAllData();
		customerData.forEach(customer -> {
			System.out.println("cid =" + customer.getCid());
			System.out.println("First Name =" + customer.getFristname());
			System.out.println("Last Name =" + customer.getLastname());
			System.out.println("Street Address =" + customer.getStreet());
			System.out.println("City =" + customer.getCity());
			System.out.println("zip code =" + customer.getZipcode());
			System.out.println("Product Name =" + customer.getProdut_name());
			System.out.println("Created By =" + customer.getCreated_on());
			System.out.println("Created On =" + customer.getCreated_by());
			System.out.println("Updated By =" + customer.getUpdated_on());
			System.out.println("Update on =" + customer.getUpdated_by());
		});
	}

}

