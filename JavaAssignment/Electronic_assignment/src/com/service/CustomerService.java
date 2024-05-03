package com.service;

import java.sql.SQLException;
import java.util.List;
import com.dto.custorderDto;
import com.model.customer;
import com.dao.CustomerDaoImpl;
import com.dao.Customerdao;

public class CustomerService {
	
	Customerdao dao =(Customerdao) new CustomerDaoImpl();

	public List<custorderDto> getTotalOrder() throws SQLException{
		return dao.getTotalOrder();
	}

	public List<customer> getAllCustomer()throws SQLException {
		return dao.getAllCustomer();
	}

}