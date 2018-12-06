package com.training.sdet.day1;

public class Customer extends Person {
	private double empIncome = 0.0;
	private String empEmployer = "";
	
	
	@Override
	public String toString() {
		return "Employee [empIncome=" + empIncome + ", empEmployer=" + empEmployer + "]";
	}
	public double getEmpIncome() {
		return empIncome;
	}
	public void setEmpIncome(double empIncome) {
		this.empIncome = empIncome;
	}
	public String getEmpEmployer() {
		return empEmployer;
	}
	public void setEmpEmployer(String empEmployer) {
		this.empEmployer = empEmployer;
	}
	
}
