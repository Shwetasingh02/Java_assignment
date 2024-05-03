package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.dto.custorderDto;
import com.model.customer;
import com.service.CustomerService;

public class CustomerController {
	
	public static void main(String[] args) {
	CustomerService customerService = new CustomerService();
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("============Customer Menu============");
		System.out.println("Press 1 : Calculate total Order ");
		System.out.println("Press 2 : Get customer Details");
		System.out.println("Press 0 : To exits");
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("Exit Customer Module.");
			break;
		}
		
		switch(input) {
		case 1:
		try {
			List<custorderDto> count= customerService.getTotalOrder();
			for(custorderDto c : count) {
				System.out.println(c);
			}
		
	}catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	break;
	
		case 2:
			try {
				List<customer> cus= customerService.getAllCustomer();
				for(customer c : cus) {
					System.out.println(c);
				}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		break;
		
   }
  }
	sc.close();
 }
}

