package com.training.sdet.day6;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class JUnitWebDriverExample {

	WebDriver driver = null;
	String baseUrl = "";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.facebook.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Ignore @Test
	public void testVerifyHomePageTitle() throws Exception {
		driver.get(baseUrl + "/");
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Facebook - Log In or Sign Up";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
	}
	
	@Test  
	public void testLoginFailure() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("email")).sendKeys("irfan@sdettraining.com");
		driver.findElement(By.id("pass")).sendKeys("PasswOrd!@#");
		// Alternative Locator
		// driver.findElement(By.cssSelector("#pass")).sendKeys("PasswOrd!@#");
		driver.findElement(By.id("u_0_2")).click();
		
		String expectedValue = "The email you’ve entered doesn’t match any account. Sign up for an account.";
		String actualValue = driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText();
		Assert.assertEquals(expectedValue,actualValue);
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
