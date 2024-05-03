package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.ProductINventorydto;
import com.model.Inventory;

public interface Inventrydao {
	
	public List<ProductINventorydto> getProduct() throws SQLException;

	public List<Inventory> getQuantity() throws SQLException;

	public List<ProductINventorydto> getLowStockProduct() throws SQLException;

}
