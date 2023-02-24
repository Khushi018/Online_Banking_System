package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.model.Customer;
import com.utility.DBUtils;

import exception.AccountantException;

public class AccountantDAOImpl implements AccountantDAO{

	@Override
	public String addAccountant(String accountantId, String accountantName, String accountantPassword) throws AccountantException {
		// TODO Auto-generated method stub
		String str = "Accountant added succesfully!! ";
		try {
			Connection con = DBUtils.connectToDatabase();
			String s = "insert into accountant values(?,?,?)";
			PreparedStatement ps =  con.prepareStatement(s);
			ps.setString(1, accountantId);
			ps.setString(2, accountantName);
			ps.setString(3, accountantPassword);
			
			int p  = ps.executeUpdate();
			if(p >0) {
				System.out.println("Done Insertion!! ");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
   

	@Override
	public String LogInWithUsernameAndPassword(String accountantID, String accountantPassword)
			throws AccountantException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String AddNewAccount(Customer cus) throws AccountantException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateAccountDetails() throws AccountantException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteAccountByAccountNumber(String accountNumber) throws AccountantException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer ShowDetailsByAccount(String accountNumber) throws AccountantException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> SeeAllAccounts() throws AccountantException {
		// TODO Auto-generated method stub
		return null;
	}

 public static void main(String[] args) {
	 AccountantDAOImpl a = new AccountantDAOImpl();
	 try {
		a.addAccountant("A003","Kiara","2342");
	} catch (AccountantException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
