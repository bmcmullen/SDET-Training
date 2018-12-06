package com.training.sdet.day1;

public class Name {
	private String firstName = "";
	private String middleInitial = "";
	private String lastName = "";

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInit() {
		return middleInitial;
	}

	public void setMiddleInit(String middleInit) {
		this.middleInitial = middleInit;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// // Generated toString
	// @Override
	// public String toString() {
	// return "Name [firstName=" + firstName + ", middleInitial=" +
	// middleInitial + ", lastName=" + lastName + "]";
	// }

	// Custom method for displaying name as "LAST, FIRST" (in upper case)
	@Override
	public String toString() {
		return (this.lastName.toUpperCase() + ", " + this.firstName.toUpperCase() + " "
				+ this.middleInitial.toUpperCase());
	};
}
