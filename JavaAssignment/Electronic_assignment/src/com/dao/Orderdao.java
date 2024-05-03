package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.Orderdto;
import com.dto.Orderpdto;
import com.model.Orderp;

public interface Orderdao {
	
	List<Orderdto> CalculateSubTotal() throws SQLException;

	List<Orderp> GetOrderDetailInfo() throws SQLException;
	List<Orderpdto> GetDiscount() throws SQLException;
	

}
