package com.training.sdet.day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverIntro {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		
		// Select Driver Type, Instantiate, and Open
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			// Get to Landing Page - First Step
			driver.get("http://www.facebook.com/");
			
			System.out.println("Page Title Is: " + driver.getTitle());
			driver.findElement(By.id("email")).sendKeys("irfan@sdettraining.com");
			driver.findElement(By.id("pass")).sendKeys("PasswOrd!@#");
			// Alternative Locator
			// driver.findElement(By.cssSelector("#pass")).sendKeys("PasswOrd!@#");
			driver.findElement(By.id("u_0_2")).click();
			
			String expectedValue = "The email you’ve entered doesn’t match any account. Sign up for an account.";
			String actualValue = "";
			
			// Looking for the error text
			//  XPATH = "//*[@id="globalContainer"]/div[3]/div/div/div"
			//  CSS Selector = "#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div"
			//  //*[@id="globalContainer"]/div[3]/div/div/div
			actualValue = driver.findElement(By.cssSelector(
					"#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();
			System.out.println("Actual Text (CSS Selector) is: "+ actualValue);
			
			actualValue = driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText();
			
			System.out.println("Actual Text (XPath) is: "+ actualValue);

			if (expectedValue.equals(actualValue)) { System.out.println("Test Results Match - Pass... ");
			} else {System.out.println("Test Mismatch - Failed.. "); }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} finally {
//			driver.close();
//			driver.quit();
//		}

	}
}
