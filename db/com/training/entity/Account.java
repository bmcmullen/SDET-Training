package com.training.entity;

public class Account {
	private int acctId;				// Primary Internal Key
	private String acctNo;			// Customer's Reference Key
	private double acctBalance;		// Current Balance
	private double acctAvgBalance;	// Need Definition
	public int getAcctId() {
		return acctId;
	}
	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public double getAcctBalance() {
		return acctBalance;
	}
	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}
	public double getAcctAvgBalance() {
		return acctAvgBalance;
	}
	public void setAcctAvgBalance(double acctAvgBalance) {
		this.acctAvgBalance = acctAvgBalance;
	}
	@Override
	public String toString() {
		return "Account [acctId=" + acctId + ", acctNo=" + acctNo + ", acctBalance=" + acctBalance + ", acctAvgBalance="
				+ acctAvgBalance + "]";
	}
	
	// Constructor for generating a "New" account - generate Acct_ID
	public Account(String acctNo, double acctBalance) {
		super();
		this.acctId = 1000; // TODO Create an id generator
		this.acctNo = acctNo;
		this.acctBalance = acctBalance;
		this.acctAvgBalance = acctBalance;
	}
	public Account(int acctId, String acctNo, double acctBalance, double acctAvgBalance) {
		super();
		this.acctId = acctId;
		this.acctNo = acctNo;
		this.acctBalance = acctBalance;
		this.acctAvgBalance = acctAvgBalance;
	}
}
