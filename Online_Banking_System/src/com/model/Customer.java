package com.model;

public class Customer {
	private String customerName;
	private String customerAdderes;
	private String customerEmail;
	private int customerPhoneNumber;
	private int accountNumber;
	private String password;
	
	public Customer() {}
	public Customer(String customerName, String customerAdderes, String customerEmail, int customerPhoneNumber,
			int accountNumber, String password) {
		super();
		this.customerName = customerName;
		this.customerAdderes = customerAdderes;
		this.customerEmail = customerEmail;
		this.customerPhoneNumber = customerPhoneNumber;
		this.accountNumber = accountNumber;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAdderes() {
		return customerAdderes;
	}
	public void setCustomerAdderes(String customerAdderes) {
		this.customerAdderes = customerAdderes;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerAdderes=" + customerAdderes + ", customerEmail="
				+ customerEmail + ", customerPhoneNumber=" + customerPhoneNumber + ", accountNumber=" + accountNumber
				+ ", password=" + password + "]";
	}
	
	
}
