package com.dto;

public class Orderpdto {
	private int id;
	private int CustomerID;
	private int total_amount;
	private double discount;
	
	
	public Orderpdto(int id, int customerID, int total_amount, double discount) {
		super();
		this.id = id;
		CustomerID = customerID;
		this.total_amount = total_amount;
		this.discount = discount;
	}
	public Orderpdto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Orderpdto [id=" + id + ", CustomerID=" + CustomerID + ", total_amount=" + total_amount + ", discount="
				+ discount + "]";
	}
	
	
	

}
