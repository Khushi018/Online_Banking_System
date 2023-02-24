package com.dao;

import java.util.List;

import com.model.Transaction;

import exception.CustomerException;

public interface CustomerDAO {
public void LogInWithUsernameAndPassword() throws CustomerException;
public int viewBalance(int accountNumber) throws CustomerException;
public List<Transaction> chechHistory() throws CustomerException;
//public String transferMoneytoAnotherAccount()


}
