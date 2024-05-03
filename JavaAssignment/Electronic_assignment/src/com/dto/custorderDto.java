package com.dto;

public class custorderDto {
	
	private int customerID;
	private String fname;
	private String lname;
	private String email;
	private int iD;
	
	
	public custorderDto(int customerID, String fname, String lname, String email, int iD) {
		super();
		this.customerID = customerID;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.iD = iD;
	}

	public custorderDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	@Override
	public String toString() {
		return "custorderDto [customerID=" + customerID + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", iD=" + iD + "]";
	}
	
	
	
	

}
