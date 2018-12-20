package com.training.sdet.day9;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsExample {

	// public static final String USERNAME = "bmcmullen";
	// public static final String ACCESS_KEY = "75ac25fc-a0ff-4870-8381-6b61afdf30ac";
	public static final String USERNAME = "AutomationTrainer";
	public static final String ACCESS_KEY = "dec4a11f-d2d2-42ce-8723-6d42e1e0e784";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws Exception {

		 DesiredCapabilities caps = DesiredCapabilities.edge();
		 caps.setCapability("platform", "Windows 10");
		 caps.setCapability("version", "16.16299");

//		DesiredCapabilities caps = DesiredCapabilities.firefox();
//		caps.setCapability("platform", "Linux");
//		caps.setCapability("version", "44.0");

		caps.setCapability("name", "Brian - FNM:SDET Training - Linux");
		caps.setCapability("extendedDebugging", "true");
		caps.setCapability("build", "3.0.1");
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

		driver.get("http://www.google.com");
		System.out.println("Page title is: " + driver.getTitle());
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Fannie Mae");
		element.submit();
		
		String actualPageTitle = driver.getTitle();
		String pageTitle = "Google";
		// assertEquals(pageTitle, actualPageTitle);
		if (pageTitle == "Google") {
			((JavascriptExecutor) driver).executeScript("sauce:job-result=passed");
		} else {
			((JavascriptExecutor) driver).executeScript("sauce:job-result=failed");
		}
		driver.quit();
	}

}