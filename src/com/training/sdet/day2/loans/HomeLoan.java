package com.training.sdet.day2.loans;

public class HomeLoan extends Loan implements BankLoan {

	public HomeLoan(int loanAmount) {
		// Home Loans can be foreclosed
		super(loanAmount, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getROI() {
		// TODO Auto-generated method stub
		return 4.5;
	}

	@Override
	public String toString() {
		return "HomeLoan {" +
				" ROI=" + getROI() + 
				"	Name=" + getName() + 
				"	Address=" + getAddress() +
			    "\n	" + super.toString() + "}";
	}

	@Override
	public void loanAmount(int amount) {
		System.out.println("Personal Loan applied for " + amount);
	}

	@Override
	public void repay(int amount) {
		System.out.println("Personal Loan repaid " + amount);		
	}

	@Override
	public void foreclosure(boolean indicator) {
		if (indicator) {
			System.out.println("A foreclosure penalty will be imposed.");
		}
	}
	
}
