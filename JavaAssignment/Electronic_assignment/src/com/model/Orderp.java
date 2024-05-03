package com.model;

public class Orderp {
	
	private int id;
	private int CustomerID;
	private int total_amount;
	
	public Orderp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orderp(int id, int customerID, int total_amount) {
		super();
		this.id = id;
		CustomerID = customerID;
		this.total_amount = total_amount;
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

	@Override
	public String toString() {
		return "Orderp [id=" + id + ", CustomerID=" + CustomerID + ", total_amount=" + total_amount + "]";
	}
	
	
}
