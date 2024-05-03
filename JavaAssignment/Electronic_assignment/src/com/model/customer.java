package com.model;

public class customer {
	
	private int CustomerID;
	private String Fname;
	private String Lname;
	private String email;
	private String PhoneNumber;
	private String address;
	
	public customer(int customerID, String fname, String lname, String email, String phoneNumber, String address) {
		super();
		CustomerID = customerID;
		Fname = fname;
		Lname = lname;
		this.email = email;
		PhoneNumber = phoneNumber;
		this.address = address;
	}

	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "customer [CustomerID=" + CustomerID + ", Fname=" + Fname + ", Lname=" + Lname + ", email=" + email
				+ ", PhoneNumber=" + PhoneNumber + ", address=" + address + "]";
	}
	
	
	
	
	
}
