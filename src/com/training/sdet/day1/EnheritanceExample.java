package com.training.sdet.day1;

public class EnheritanceExample {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setPersionId(1);
		emp.setEmpPosition("SDET");
		emp.setEmpSalary(2500.00);
		Name personName = new Name();
		personName.setFirstName("Steve");
		personName.setLastName("Jobs");
		
		emp.setPersonName(personName);
		
		
		System.out.println(emp);
	}
}
