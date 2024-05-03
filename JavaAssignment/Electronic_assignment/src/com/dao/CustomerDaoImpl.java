package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.dto.custorderDto;
import com.model.customer;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.utility.DBConnection;

public class CustomerDaoImpl implements Customerdao {

	@Override
	public List<custorderDto> getTotalOrder()throws SQLException {
		Connection con = (Connection) DBConnection.dbConnect();
		String sql= "select c.FirstName,c.LastName ,count(o.id)"
				    + "from orderp o JOIN Customers c ON o.CustomerID= c.CustomerID"
				    + " group by o.iD;";
		
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
	    ResultSet rst = pstmt.executeQuery();
	    List<custorderDto> list = new ArrayList<>();
	    
	    while(rst.next() == true) {
	    	
	    	int customerID= rst.getInt("CustomerID");
	        String fname=rst.getString("Fname");
	        String lname=rst.getString("Lname");
	        String email=rst.getString("email");
	    	int iD=rst.getInt("iD");
	    	
	    	custorderDto custorder = new custorderDto(customerID,fname,lname,email,iD);
	    	list.add(custorder);
	    	
	    }
		DBConnection.dbClose();	
		return list;
	}

	@Override
	public List<customer> getAllCustomer()throws SQLException {
		Connection con = (Connection) DBConnection.dbConnect();
		String sql="select * from Customers";
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
	    ResultSet rst = pstmt.executeQuery();
	    List<customer> list = new ArrayList<>();
	    
 while(rst.next() == true) {
	    	
	    	int customerID= rst.getInt("CustomerID");
	        String fname=rst.getString("FirstName");
	        String lname=rst.getString("LastName");
	        String email=rst.getString("Email");
	        String phoneNumber=rst.getString("Phone");
	        String address=rst.getString("Address");
	    	
	    	
	    	customer cus = new customer(customerID,fname,lname,email,phoneNumber,address);
	    	list.add(cus);
 }
		
		DBConnection.dbClose();	
		return list;
	}
}

