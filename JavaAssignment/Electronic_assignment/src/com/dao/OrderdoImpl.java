package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Orderdto;
import com.dto.Orderpdto;
import com.model.Orderp;
import com.utility.DBConnection;

public class OrderdoImpl implements Orderdao {

	@Override
	public List<Orderdto> CalculateSubTotal() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql=" SELECT o.id AS order_id, o.CustomerID,o.total_amount,SUM(od.quantity * o.total_amount) AS subtotal "
				+ "FROM Orderp o JOIN OrderDetails od"
				+ " ON o.id = od.order_id     "
				+ " group by od.OrderDetailID;";
		PreparedStatement pstmt =  con.prepareStatement(sql);
	    ResultSet rst = pstmt.executeQuery();
	    List<Orderdto> list = new ArrayList<>();
	    while(rst.next() == true) {
	    
	    	int id=rst.getInt("order_id");
	    	int CustomerID=rst.getInt("CustomerID");
	    	int total_amount=rst.getInt("total_amount");
	    	int subtotal=rst.getInt("subtotal");
	    	
	    	Orderdto order=new Orderdto(id,CustomerID,total_amount,subtotal);
	    	list.add(order);
	    }
		DBConnection.dbClose();	
		return list;
		
	}

	@Override
	public List<Orderp> GetOrderDetailInfo() throws SQLException {
		
		Connection con = DBConnection.dbConnect();
		String sql="select * from orderp";
		PreparedStatement pstmt =  con.prepareStatement(sql);
	    ResultSet rst = pstmt.executeQuery();
	    List<Orderp> list = new ArrayList<>();
	    while(rst.next() == true) {
	    
	    	int id=rst.getInt("id");
	    	int CustomerID=rst.getInt("CustomerID");
	    	int total_amount=rst.getInt("total_amount");
	    	
	    	Orderp order=new Orderp(id,CustomerID,total_amount);
	    	list.add(order);
	    }
		DBConnection.dbClose();	
		return list;
		
	}

	@Override
	public List<Orderpdto> GetDiscount() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select *, (total_amount)-((1/20)*total_amount) as discount\r\n"
				+ " from orderp";
		PreparedStatement pstmt =  con.prepareStatement(sql);
	    ResultSet rst = pstmt.executeQuery();
	    List<Orderpdto> list = new ArrayList<>();
	    while(rst.next() == true) {
	    
	    	int id=rst.getInt("id");
	    	int CustomerID=rst.getInt("CustomerID");
	    	int total_amount=rst.getInt("total_amount");
	    	int discount=rst.getInt("discount");
	    	
	    	Orderpdto order=new Orderpdto(id,CustomerID,total_amount,discount);
	    	list.add(order);
	    }
		DBConnection.dbClose();	
		return list;
		
	}

}
