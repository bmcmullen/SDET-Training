package com.training.sdet.day6;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NGTestExercise {
	
	// Groups are processed within the "Class" and before the "Method"  level
	@BeforeGroups("ShoppingCart")
	public void setupBusinessProcess() {
		System.out.println("Setup Group for ShoppingCart...");
	}

	@Test(groups = {"ShoppingCart" },priority = 0)
	public void login() {
		System.out.println("Login");
	}

	@Test(groups = {"ShoppingCart" },priority = 1)
	public void search() {
		System.out.println("Search");
	}
	@Test(groups = {"ShoppingCart" },priority = 2)
	public void addItem() {
		System.out.println("Add Item");
	}
	@Test(groups = {"ShoppingCart" },priority = 3)
	public void modifyQuantity() {
		System.out.println("Modify Quantity");
	}
	@Test(groups = {"ShoppingCart" },priority = 4)
	public void checkout() {
		System.out.println("Checkout");
	}
	@Test(groups = {"ShoppingCart" },priority = 5)
	public void payment() {
		System.out.println("Payment");
	}
	

	@BeforeMethod
	public void beforeMethod() {
//		System.out.println("			Before Method");
	}

	@AfterMethod
	public void afterMethod() {
//		System.out.println("			After Method");
	}

	@BeforeClass
	public void beforeClass() {
//		System.out.println("		Before Class");
	}

	@AfterClass
	public void afterClass() {
//		System.out.println("		After Class");
	}

	@BeforeTest
	public void beforeTest() {
//		System.out.println("	Before Test");
	}

	@AfterTest
	public void afterTest() {
//		System.out.println("	After Test");
	}
	
	
// Suite
//	@BeforeSuite
//	public void beforeSuite() {
//		System.out.println("Before Suite");
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("After Suite");
//	}
}
