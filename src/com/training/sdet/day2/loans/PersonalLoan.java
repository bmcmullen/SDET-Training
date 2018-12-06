package com.training.sdet.day2.loans;

public class PersonalLoan extends Loan implements BankLoan {

	public PersonalLoan(int loanAmount) {
		super(loanAmount, false);
		// TODO Auto-generated constructor stub
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

	@Override
	public double getROI() {
		// TODO Auto-generated method stub
		return 8.725;
	}

	@Override
	public String toString() {
		return "PersonalLoan {" +
				" ROI=" + getROI() + 
				"	Name=" + getName() + 
				"	Address=" + getAddress() +
			    "\n	" + super.toString() + "}";	}
}
