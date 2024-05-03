package com.model;

public class Inventory {

	private int InventoryID;
	private int ProductID;
	private int QuantityInStock;
	private int LastStockUpdate;
	
	
	public Inventory(int inventoryID, int productID, int quantityInStock, int lastStockUpdate) {
		super();
		InventoryID = inventoryID;
		ProductID = productID;
		QuantityInStock = quantityInStock;
		LastStockUpdate = lastStockUpdate;
	}
	
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getInventoryID() {
		return InventoryID;
	}
	public void setInventoryID(int inventoryID) {
		InventoryID = inventoryID;
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public int getQuantityInStock() {
		return QuantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		QuantityInStock = quantityInStock;
	}
	public int getLastStockUpdate() {
		return LastStockUpdate;
	}
	public void setLastStockUpdate(int lastStockUpdate) {
		LastStockUpdate = lastStockUpdate;
	}
	@Override
	public String toString() {
		return "Inventory [InventoryID=" + InventoryID + ", ProductID=" + ProductID + ", QuantityInStock="
				+ QuantityInStock + ", LastStockUpdate=" + LastStockUpdate + "]";
	}
	
	
}
