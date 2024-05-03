package com.dto;

public class ProductINventorydto {
	
	private int InventoryID;
	private int ProductID;
	private int QuantityInStock;
	private String LastStockUpdate;
	
	private int id;
	private String p_name;
	private String describtion;
	private int price;
	
	
	public ProductINventorydto(int inventoryID, int productID, int quantityInStock, String lastStockUpdate, int id,
			String p_name, String describtion, int price) {
		super();
		InventoryID = inventoryID;
		ProductID = productID;
		QuantityInStock = quantityInStock;
		LastStockUpdate = lastStockUpdate;
		this.id = id;
		this.p_name = p_name;
		this.describtion = describtion;
		this.price = price;
	}
	public ProductINventorydto() {
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
	public String getLastStockUpdate() {
		return LastStockUpdate;
	}
	public void setLastStockUpdate(String lastStockUpdate) {
		LastStockUpdate = lastStockUpdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getDescribtion() {
		return describtion;
	}
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductINventorydto [InventoryID=" + InventoryID + ", ProductID=" + ProductID + ", QuantityInStock="
				+ QuantityInStock + ", LastStockUpdate=" + LastStockUpdate + ", id=" + id + ", p_name=" + p_name
				+ ", describtion=" + describtion + ", price=" + price + "]";
	}
	
	

}
