package com.training.sdet.day2.loans;

public interface BankLoan {
	void loanAmount(int amount);
	void repay(int amount);
	void foreclosure(boolean indicator);
}
