package com.training.client;

import com.training.dao.AccountDAO;
import com.training.entity.Account;
import com.training.standards.IAccountDAO;

public class AccountClient {
	public static void main(String[] args) {
		boolean operationFlag = false;
		Account acct = new Account(1234,"Brian-1234",45025.25,40125.34);
		
		IAccountDAO dao = new AccountDAO();

		// Simplified conditional code segment - <condition> ? "<True>:<False>"
				
		operationFlag = dao.insertAccount(acct);
		System.out.println(operationFlag ? "Record Inserted" : "Insert Failed");

		operationFlag = dao.updateAccountBalance(1234, 0.45);
		System.out.println(operationFlag ? "Record Updated" : "Update Failed");
		
		acct = dao.getAccount(1234);
		System.out.println("Found 1234 as:" + acct);
		
		acct = dao.getAccount(23503244);
		System.out.println("Found 100 as:" + acct);
		
		operationFlag = dao.deleteAccount(1234);
		System.out.println(operationFlag ? "Record Deleted" : "Delete Failed");
		
		dao.getAllAccounts().forEach(System.out::println);
	}
}
