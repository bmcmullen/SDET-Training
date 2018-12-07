package com.training.businesslogic.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.businesslogic.MyBusinessLogic;

public class MyBusinessLogicTest {
	MyBusinessLogic mbl = null;

	// This will only execute once (usefull if there is resources to share accross all tests
	@BeforeClass
	public static void setUpBeforeClass () {
		System.out.println("Setting up shared test resources...");
	}
	
	@Before
	public void setupAnyName() {
		mbl = new MyBusinessLogic();
		// Any other setup needs
		
		System.out.println("Setting up test prerequisites...");
	}
	
	@After
	public void tearDownAnyName() {
		System.out.println("Tearing down test resources and cleaning up.");
	}
	
	@AfterClass
	public static void finalTearDowns() {
		System.out.println("Final Cleanup...");
	}
	
	// Testcases method must be public and return void with no arguments & annotate as @Test
	@Test(timeout=500)
	public void isertRecordTest() throws InterruptedException {
		MyBusinessLogic mbl = new MyBusinessLogic();
		int retVal = 1;
		
		Thread.sleep(450);
		assertEquals(retVal, mbl.insertRecord(101,"Fred"));
		
	}

	// Setting a expectation of a Thrown Exception is useful for negative testing.
	@Test(expected=RuntimeException.class)
	public void sayHelloTest() {
		MyBusinessLogic mbl = new MyBusinessLogic();
		String name = "George";
		String retVal = "Hello"  + name;
		
		assertEquals(retVal,mbl.sayHello(name));
	}
}

