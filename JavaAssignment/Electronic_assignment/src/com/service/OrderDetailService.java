package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.OrderDetaildao;
import com.dto.Orderdto;
import com.dto.Orderpdto;
import com.model.Orderp;
import com.dao.OrderDetaildaoImpl;

public class OrderDetailService {

	OrderDetaildao dao=new OrderDetaildaoImpl();
	public List<Orderdto> getTotalAmount() throws SQLException{
		return dao.getTotalAmount();
	}
	public List<Orderp> GetOrderDetailInfo() throws SQLException {
		
		return dao.GetOrderDetailInfo() ;
	}
	public List<Orderpdto> GetDiscount() throws SQLException {
		// TODO Auto-generated method stub
		return dao.GetDiscount();
	}
	
	

}
