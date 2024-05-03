package com.dto;

public class Orderdto {

	private int id;
	private int CustomerID;
	private int total_amount;
	private int subtotal;
	
	
	public Orderdto(int id, int customerID, int total_amount, int subtotal) {
		super();
		this.id = id;
		CustomerID = customerID;
		this.total_amount = total_amount;
		this.subtotal = subtotal;
	}


	public Orderdto() {
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


	public int getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}


	@Override
	public String toString() {
		return "Orderdto [id=" + id + ", CustomerID=" + CustomerID + ", total_amount=" + total_amount + ", subtotal="
				+ subtotal + "]";
	}
	
	
	
	
}
