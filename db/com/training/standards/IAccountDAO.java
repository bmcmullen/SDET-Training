package com.training.standards;

import java.util.List;

import com.training.entity.Account;

public interface IAccountDAO {

	public boolean insertAccount(Account acct);
	public boolean deleteAccount(int acctId);
	public boolean updateAccountBalance(int acctId, double change);
	
	public Account getAccount(int acctId);
	public List<Account> getAllAccounts();
	
}
