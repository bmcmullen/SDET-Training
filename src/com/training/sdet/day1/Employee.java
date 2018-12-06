package com.training.sdet.day1;

public class Employee extends Person {
	private double empSalary = 0.0;
	private String empPosition = "";
	
	
	@Override
	public String toString() {
		return "Employee [empSalary=" + empSalary + ", empPosition=" + empPosition + "]";
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	
}
