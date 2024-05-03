package com.model;

public class OrderDetail {
	
	private int OrderDetailID;
	private int Order_iD;
	private int ProductID;
	private int Quantity;
	
	
	public OrderDetail(int orderDetailID, int order_iD, int productID, int quantity) {
		super();
		OrderDetailID = orderDetailID;
		Order_iD = order_iD;
		ProductID = productID;
		Quantity = quantity;
	}
	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrderDetailID() {
		return OrderDetailID;
	}
	public void setOrderDetailID(int orderDetailID) {
		OrderDetailID = orderDetailID;
	}
	public int getOrder_iD() {
		return Order_iD;
	}
	public void setOrder_iD(int order_iD) {
		Order_iD = order_iD;
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderDetail [OrderDetailID=" + OrderDetailID + ", Order_iD=" + Order_iD + ", ProductID=" + ProductID
				+ ", Quantity=" + Quantity + "]";
	}
	
	

}
