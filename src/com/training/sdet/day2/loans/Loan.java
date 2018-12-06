package com.training.sdet.day2.loans;

public abstract class Loan {
	private int loanAmount;
	private boolean foreclosureInd;

	public Loan(int loanAmount, boolean foreclosureInd) {
		this.loanAmount = loanAmount;
		this.foreclosureInd = foreclosureInd;
	}

	public String getName() {
		return "Accout Holder Name";
	}

	public String getAddress() {
		return "Address";
	}

	public abstract double getROI();

	@Override
	public String toString() {
		return "Loan [loanAmount=" + loanAmount + "	Foreclosable:" + foreclosureInd + "] ";
	}
}
