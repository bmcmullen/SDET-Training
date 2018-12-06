package com.training.sdet.day2.loans;

public class LoanClient {
	private static void displayLoanSummary(Loan loan) {
		System.out.println("Loan:" + loan);
//		System.out.println("Name : " + loan.getName());
//		System.out.println("Address : " + loan.getAddress());
//		System.out.println("ROI : " + loan.getROI());
	}

	public static void main(String[] args) {
		Loan loan = new HomeLoan(345000);
		displayLoanSummary(loan);

		loan = new VehicleLoan(25000);
		displayLoanSummary(loan);

		loan = new StudentLoan(12500);
		displayLoanSummary(loan);
		
		loan = new PersonalLoan(5000);
		displayLoanSummary(loan);		
	}

}
