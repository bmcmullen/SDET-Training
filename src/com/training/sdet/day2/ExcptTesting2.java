package com.training.sdet.day2;

public class ExcptTesting2 {
	public static void checkName(String name) throws NameTooShortException {
		if (name.length() < 3) {
			throw new NameTooShortException("You name is too short");
		}
	}
	
	public static void checkCreditScore(String custName, int creditScore) throws Exception {
		try {
			checkName(custName);

			if (creditScore < 400) {
				throw new RuntimeException("Sorry Credit Score too low " + custName);
			} else if (creditScore >= 400 && creditScore < 700) {
				throw new RuntimeException("Need Background Verification " + custName);
			} else {
				System.out.println("You are good to go " + custName);
			}
		} catch (NameTooShortException ntse) {
			throw new Exception("Sorry did not process since name problem", ntse);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkCreditScore("Kitch ", 440);
		} catch (Exception e) {
			// e.printStackTrace();
		}
		
		System.out.println("Carryon with BAU...");
	}
}
