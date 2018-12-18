package com.training.sdet.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGxmlParams {
	private WebDriver driver;
	private String baseURL;
	private String platform;
	private String browser;
	private String aut;

	@BeforeClass
	@org.testng.annotations.Parameters(value={"browser","aut","platform"})
	public void setup(String b, String a, String p) throws Exception {
		browser = b;
		aut = a;
		platform = p;
		
		switch (browser) {
		case "ie":
			System.setProperty("webdirver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println("Running test in browser... " + browser);
			break;
		case "chrome":
			System.setProperty("webdirver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Running test in browser... " + browser);
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Running test in browser....." + browser);
			break;
		default:
			System.setProperty("webdirver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println("Running test as default in IE");
			break;
		}
		baseURL = aut;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}


	@Test
	public void test() throws Exception {
		driver.get(baseURL + "/");
		Thread.sleep(3000);
		String actualPageTitle = driver.getTitle();
		System.out.println("Browser: "+ browser + 
				"	- Navigated to: " + aut + 
				"\n		Page Title is: " + actualPageTitle);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
