package com.training.sdet.day1;

public class Account {
	private int accId = 0;
	private double accBal = 0.0;
	private Name accHolderName = new Name();

	// Create access methods

	// Allows the establishment of the account Id if not already set
	public void setAcctId(int id) {
		if (this.accId == 0) {
			this.accId = id;
		} else {
			System.out.println("*** Exception *** Should thow an exception: Accout Id Already Set.");
		}
	}

	// Generated
	public int getAccId() {
		return accId;
	}

	// Update the current Account Balance by adding the double provided.
	public void updateAcctBalance(double amt) {
		if ((this.accBal + amt) >= 0) {
			// update allowed if balance remains above 0
			this.accBal = this.accBal + amt;
			System.out.println("Account Id: " + this.accId + " Updated by $" + amt);
		} else {
			System.out.println("*** Exceptiong *** Balance to low!!!");
		}
	}

	// Retrieve Balance
	public double retriveAcctBalance() {
		return this.accBal;
	}

	// Generated
	public Name getAccHolderName() {
		return accHolderName;
	}

	// Generated
	public void setAccHolderName(Name name) {
		this.accHolderName = name;
	}

	// // Generated toString()
	// @Override
	// public String toString() {
	// return "Account [accId=" + accId + ", accBal=" + accBal + ",
	// accHolderName=" + accHolderName + "]";
	// }

	// Custom toString()
	@Override
	public String toString() {
		return "Account Id: " + this.accId + "\nAccount Holder: " + this.accHolderName + "\nCurrent Bal= $"
				+ this.accBal;
	}

}
