package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.Inventrydao;
import com.dao.InventorydaoImpl;
import com.dto.ProductINventorydto;
import com.model.Inventory;

public class InventoryService {
 
	Inventrydao dao= new InventorydaoImpl();
	
	public List<ProductINventorydto> getProduct() throws SQLException {
		return dao.getProduct();
	}

	public List<Inventory> getQuantity() throws SQLException{
		return dao.getQuantity();
	}

	public List<ProductINventorydto> getLowStockProduct() throws SQLException {
		return dao.getLowStockProduct();
	}

}
