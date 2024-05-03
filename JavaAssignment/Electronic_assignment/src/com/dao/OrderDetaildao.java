package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.Orderdto;
import com.dto.Orderpdto;
import com.model.Orderp;

public interface OrderDetaildao {

	 List<Orderdto> getTotalAmount() throws SQLException ;

	List<Orderp> GetOrderDetailInfo()  throws SQLException;

	List<Orderpdto> GetDiscount() throws SQLException;

}
