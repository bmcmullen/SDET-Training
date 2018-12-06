package com.training.sdet.day1;

public class Person {
	private int persionId = 0;
	private Name personName = new Name();
			
	@Override
	public String toString() {
		return "Person [persionId=" + persionId + ", personName=" + personName + "]";
	}
	public int getPersionId() {
		return persionId;
	}
	public void setPersionId(int persionId) {
		this.persionId = persionId;
	}
	public Name getPersonName() {
		return personName;
	}
	public void setPersonName(Name personName) {
		this.personName = personName;
	}
}