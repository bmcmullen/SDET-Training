package com.training.client;

import com.training.dao.EmployeeDAO;
import com.training.entity.Employee;
import com.training.standards.IEmployeeDAO;

public class EmployeeClient {
	public static void main(String[] args) {
		boolean operationFlag = false;
		Employee emp = new Employee(123,"Brian",45025.25,"b@fnm.com");
		
		IEmployeeDAO dao = new EmployeeDAO();

		// Simplified conditional code segment - <condition> ? "<True>:<False>"
				
		operationFlag = dao.insertEmployee(emp);
		System.out.println(operationFlag ? "Record Inserted" : "Insert Failed");

		operationFlag = dao.updateEmployeeSalary(123, 65258.00);
		System.out.println(operationFlag ? "Record Updated" : "Update Failed");
		
		emp = dao.getEmployee(123);
		System.out.println("Found 123 as:" + emp);
		
		emp = dao.getEmployee(100);
		System.out.println("Found 100 as:" + emp);
		
		operationFlag = dao.deleteEmployee(123);
		System.out.println(operationFlag ? "Record Deleted" : "Delete Failed");
		
		dao.getAllEmployees().forEach(System.out::println);
	}
}
