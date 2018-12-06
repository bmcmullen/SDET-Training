package com.training.sdet.day2.loans;

public class VehicleLoan extends Loan {

	
	public VehicleLoan(int loanAmount) {
		super(loanAmount, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getROI() {
		// TODO Auto-generated method stub
		return 2.45;
	}
	
	@Override
	public String toString() {
		return "VehicleLoan {" +
				" ROI=" + getROI() + 
				"	Name=" + getName() + 
				"	Address=" + getAddress() +
			    "\n	" + super.toString() + "}";
	}

}
