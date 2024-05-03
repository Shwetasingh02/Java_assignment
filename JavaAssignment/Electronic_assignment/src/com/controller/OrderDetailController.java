package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.Orderdto;
import com.dto.Orderpdto;
import com.model.Orderp;
import com.service.OrderDetailService;

public class OrderDetailController {
	
	public static void main(String[] args) {
		
		OrderDetailService  orderDetailService  =new OrderDetailService ();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("============OrderDetail Menu============");
			System.out.println("Press 1 : Calculate Total Amount");
			System.out.println("Press 2 : Display OrderDetail");
			System.out.println("Press 3 : Get Discount");
			System.out.println("Press 0 : TO Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exit Customer Module.");
				break;
			}
			
			switch(input) {
		case 1:
			   try {
				List<Orderdto> orders= orderDetailService.getTotalAmount();
				for( Orderdto o : orders) {
					System.out.println(o);
				}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		break;
		
		case 2:
			   try {
				List<Orderp> orders= orderDetailService.GetOrderDetailInfo();
				for( Orderp o : orders) {
					System.out.println(o);
				}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		break;
		
		case 3:
			
			 try {
					List<Orderpdto> orders= orderDetailService.GetDiscount();
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
