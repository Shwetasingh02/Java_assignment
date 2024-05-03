package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.ProductINventorydto;
import com.model.Inventory;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.utility.DBConnection;

public class InventorydaoImpl implements Inventrydao   {

	@Override
	public List<ProductINventorydto> getProduct() throws SQLException {
		Connection con = (Connection) DBConnection.dbConnect();
		String sql="select *\r\n"
				+ " from product p join inventory i "
				+ "on p.id=i.ProductID;";
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
	    ResultSet rst = pstmt.executeQuery();
	    List<ProductINventorydto> list = new ArrayList<>();
	    
	    while(rst.next() == true) {
	    
	    	int inventoryID=rst.getInt("inventoryID");
	    	int productID=rst.getInt("productID");
	    	int quantityInStock=rst.getInt("quantityInStock");
	    	String lastStockUpdate=rst.getString("LastStockUpdate"); 
	    	int id=rst.getInt("id");
			String p_name=rst.getString("p_name");
			String describtion=rst.getString("describtion");
			int price=rst.getInt("price");
			
			ProductINventorydto pro= new ProductINventorydto(inventoryID,productID,quantityInStock,lastStockUpdate,id,p_name,describtion,price);
			list.add(pro);
	    }
		DBConnection.dbClose();	
		return list;
	}

	@Override
	public List<Inventory> getQuantity() throws SQLException {
		Connection con = (Connection) DBConnection.dbConnect();
		String sql="select * from inventory order by QuantityInStock";
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
	    ResultSet rst = pstmt.executeQuery();
	    List<Inventory> list = new ArrayList<>();
	    
	    while(rst.next() == true) {
	    
	    	int inventoryID=rst.getInt("InventoryID");
	    	int productID=rst.getInt("ProductID");
	    	int quantityInStock=rst.getInt("QuantityInStock");
	    	int lastStockUpdate=rst.getInt("LastStockUpdate");
			
	    	Inventory pro= new Inventory(inventoryID,productID,quantityInStock,lastStockUpdate);
			list.add(pro);
		
	}
	    DBConnection.dbClose();
		return list;
	}

	@Override
	public List<ProductINventorydto> getLowStockProduct() throws SQLException {
		Connection con = (Connection) DBConnection.dbConnect();
		String sql="select *"
				+ " from product p join inventory i "
				+ "on p.id=i.ProductID "
				+ "order by QuantityInStock "
				+ "limit 1";
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
	    ResultSet rst = pstmt.executeQuery();
	    List<ProductINventorydto> list = new ArrayList<>();
	    
	    while(rst.next() == true) {
	    
	    	int inventoryID=rst.getInt("inventoryID");
	    	int productID=rst.getInt("productID");
	    	int quantityInStock=rst.getInt("quantityInStock");
	    	String lastStockUpdate=rst.getString("LastStockUpdate"); 
	    	int id=rst.getInt("id");
			String p_name=rst.getString("p_name");
			String describtion=rst.getString("describtion");
			int price=rst.getInt("price");
			
			ProductINventorydto pro= new ProductINventorydto(inventoryID,productID,quantityInStock,lastStockUpdate,id,p_name,describtion,price);
			list.add(pro);
	    }
		DBConnection.dbClose();	
		return list;
		
	}
}

