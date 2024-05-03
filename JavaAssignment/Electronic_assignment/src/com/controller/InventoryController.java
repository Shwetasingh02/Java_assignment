package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.dto.ProductINventorydto;
import com.service.InventoryService;
import com.model.Inventory;

public class InventoryController {
	public static void main(String[] args) {
		
		InventoryService inventoryService =new InventoryService();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("============Inventory Menu============");
			System.out.println("Press 1 : Get Product ");
			System.out.println("Press 2 : Get Quantity");
			System.out.println("Press 3 : List Low Stock Product");
			System.out.println("Press 0 : To exits");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exit Customer Module.");
				break;
			}
			switch (input) {
			case 1:
				
				try {
					List<ProductINventorydto> count= inventoryService.getProduct();
					for(ProductINventorydto c : count) {
						System.out.println(c);
					}
				
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
				break;
				
			case 2:
				try {
					List<Inventory> count= inventoryService.getQuantity();
					for(Inventory c : count) {
						System.out.println(c);
					}
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
				
				break;
				
			case 3:
				
				try {
					List<ProductINventorydto> count= inventoryService.getLowStockProduct();
					for(ProductINventorydto c : count) {
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