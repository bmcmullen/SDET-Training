package com.training.sdet.day2.loans;

public class StudentLoan extends Loan implements BankLoan {

	public StudentLoan(int loanAmount) {
		super(loanAmount, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getROI() {
		// TODO Auto-generated method stub
		return 1.2;
	}

	@Override
	public String toString() {
		return "StudentLoan {" + " ROI=" + getROI() + "	Name=" + getName() + "	Address=" + getAddress() + "\n	"
				+ super.toString() + "}";
	}

	@Override
	public void loanAmount(int amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void repay(int amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void foreclosure(boolean indicator) {
		if (indicator) {
			System.out.println("A foreclosure penalty will be imposed.");
		}
	}
}
