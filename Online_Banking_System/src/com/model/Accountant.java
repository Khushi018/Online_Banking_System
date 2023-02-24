package com.model;

public class Accountant {
private String accountantID;
private String accountantName;

private String accountantPassword;

public Accountant(){}

public Accountant(String accountantID, String accountantName, String accountantPassword) {
	super();
	this.accountantID = accountantID;
	this.accountantName = accountantName;
	this.accountantPassword = accountantPassword;
}

public String getAccountantID() {
	return accountantID;
}

public void setAccountantID(String accountantID) {
	this.accountantID = accountantID;
}

public String getAccountantName() {
	return accountantName;
}

public void setAccountantName(String accountantName) {
	this.accountantName = accountantName;
}

public String getAccountantPassword() {
	return accountantPassword;
}

public void setAccountantPassword(String accountantPassword) {
	this.accountantPassword = accountantPassword;
}

@Override
public String toString() {
	return "Accountant [accountantID=" + accountantID + ", accountantName=" + accountantName + ", accountantPassword="
			+ accountantPassword + "]";
}

}
