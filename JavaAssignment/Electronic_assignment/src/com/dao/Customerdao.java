package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.custorderDto;
import com.model.customer;

public interface Customerdao {

	public List<custorderDto> getTotalOrder() throws SQLException;
	public List<customer> getAllCustomer() throws SQLException;

}
