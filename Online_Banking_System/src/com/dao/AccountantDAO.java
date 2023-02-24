package com.dao;
import java.util.List;
import com.model.Customer;

import exception.AccountantException;
import exception.CustomerException;

public interface AccountantDAO {
public String addAccountant(String accountantId,String accountantName, String accountantPassword)	throws AccountantException;
public String LogInWithUsernameAndPassword(String accountantID, String accountantPassword) throws AccountantException;
public String AddNewAccount(Customer cus) throws AccountantException;
public String UpdateAccountDetails() throws AccountantException; 
public String DeleteAccountByAccountNumber(String accountNumber) throws AccountantException;
public Customer ShowDetailsByAccount(String accountNumber) throws AccountantException;
public List<Customer> SeeAllAccounts() throws AccountantException;
//deposit withdrawl operations 
}
