package com.training.businesslogic.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.dao.AccountDAO;
import com.training.entity.Account;
import com.training.standards.IAccountDAO;

public class MyAccountLogicTest {
	IAccountDAO dao = null;
		
	// This will only execute once (usefull if there is resources to share accross all tests
	@BeforeClass
	public static void setUpBeforeClass () {
		System.out.println("Setting up shared test resources...");
	}
	
	@Before
	public void setupAnyName() {
		dao = new AccountDAO();
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
	
/*****
 * Test Cases
 */
		
	@Test(timeout=100)
	public void insertRecordTest() throws InterruptedException {
		Account acct = new Account(1234,"Brian-1234",45025.25,40125.34);
		assertTrue(dao.insertAccount(acct));	
	}

	@Test(timeout=100)
	public void updateRecordTest() throws InterruptedException {
		System.out.println("Positive Update Test... Change the Account Balance.");
		assertTrue(dao.updateAccountBalance(1234, 0.45));	
	}
	
	@Test(timeout=100)
	public void updateFailsTest() throws InterruptedException {
		System.out.println("Positive Failure to Update Test... - Account Not Found.");
		assertFalse(dao.updateAccountBalance(1234000, 0.45));	
	}

}

