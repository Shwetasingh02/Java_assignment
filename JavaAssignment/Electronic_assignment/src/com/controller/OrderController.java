package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.Orderdto;
import com.dto.custorderDto;
import com.model.Orderp;
import com.dto.Orderpdto;
import com.service.OrderService;

public class OrderController {
	
	public static void main(String [] args) {	
	OrderService orderService=new OrderService();
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("============Order Menu============");
		System.out.println("Press 1 : CalculateSubTotal");
		System.out.println("Press 2 : GetOrderDetailInfo");
		System.out.println("Press 3 : AddDiscount");
		System.out.println("Press 0 : TO Exit");
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("Exit Customer Module.");
			break;
		}
		switch(input) {
		
	case 1:
		   try {
			List<Orderdto> orders= orderService.CalculateSubTotal();
			for( Orderdto o : orders) {
				System.out.println(o);
			}
		
	}catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	break;
	
	case 2:
		   try {
			List<Orderp> orders= orderService.GetOrderDetailInfo();
			for( Orderp o : orders) {
				System.out.println(o);
			}
		
	}catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	break;
		
	case 3:
		
		 try {
				List<Orderpdto> orders= orderService.GetDiscount();
				for( Orderpdto o : orders) {
					System.out.println(o);
				}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		break;
		
	}
}
	}
}
