package com.model;

import java.time.LocalDate;

public class Transaction {
private LocalDate datetime;
private int depositDetails;
private int withdrawDetails;
private int transactionId;
private int balanceDetails;
public Transaction() {}
public Transaction(LocalDate datetime, int depositDetails, int withdrawDetails, int transactionId, int balanceDetails) {
	super();
	this.datetime = datetime;
	this.depositDetails = depositDetails;
	this.withdrawDetails = withdrawDetails;
	this.transactionId = transactionId;
	this.balanceDetails = balanceDetails;
}
public LocalDate getDatetime() {
	return datetime;
}
public void setDatetime(LocalDate datetime) {
	this.datetime = datetime;
}
public int getDepositDetails() {
	return depositDetails;
}
public void setDepositDetails(int depositDetails) {
	this.depositDetails = depositDetails;
}
public int getWithdrawDetails() {
	return withdrawDetails;
}
public void setWithdrawDetails(int withdrawDetails) {
	this.withdrawDetails = withdrawDetails;
}
public int getTransactionId() {
	return transactionId;
}
public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
}
public int getBalanceDetails() {
	return balanceDetails;
}
public void setBalanceDetails(int balanceDetails) {
	this.balanceDetails = balanceDetails;
}
@Override
public String toString() {
	return "Transaction [datetime=" + datetime + ", depositDetails=" + depositDetails + ", withdrawDetails="
			+ withdrawDetails + ", transactionId=" + transactionId + ", balanceDetails=" + balanceDetails + "]";
}
}
