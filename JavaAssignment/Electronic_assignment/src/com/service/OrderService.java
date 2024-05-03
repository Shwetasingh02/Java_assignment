package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.Orderdao;
import com.dao.OrderdoImpl;
import com.dto.Orderdto;
import com.dto.Orderpdto;
import com.model.Orderp;

public class OrderService {
	
	 Orderdao dao= new  OrderdoImpl();

	public  List<Orderdto> CalculateSubTotal() throws SQLException{
		return dao.CalculateSubTotal();
	}

	public List<Orderp> GetOrderDetailInfo() throws SQLException {
		return dao.GetOrderDetailInfo();
	}

	public List<Orderpdto> GetDiscount() throws SQLException{
		return  dao.GetDiscount();
	}

	
	
}
