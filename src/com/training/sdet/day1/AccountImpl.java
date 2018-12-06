package com.training.sdet.day1;

public class AccountImpl {
	public static void main(String[] args) {

		Account clientAcct = new Account();

		// Set the values for this first Account Instance
		clientAcct.setAcctId(101);
		clientAcct.updateAcctBalance(250.00);

		// Create a new Name object
		Name acctHolderName = new Name();
		acctHolderName.setFirstName("Steve");
		acctHolderName.setLastName("Jobs");

		// Set the Account Holder's Name
		clientAcct.setAccHolderName(acctHolderName);
		System.out.println(clientAcct);

		// Try to withdraw more money that is not available.
		clientAcct.updateAcctBalance(-300.00);

		// Withdraw an appropriate amount
		clientAcct.updateAcctBalance(-60.00);
		System.out.println(clientAcct);

	}
}