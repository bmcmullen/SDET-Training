package com.training.sdet.day7;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

@RunWith(Parameterized.class)
public class JUnitDataDrivenTest {
	private String platform = "";
	private String browser = "";
	private String aut = "";

	@Parameterized.Parameters
	public static LinkedList<String[]> getEnvironments() throws Exception {
		LinkedList<String[]> envs = new LinkedList<String[]>();
		envs.add(new String[] { Platform.WINDOWS.toString(), "ie", "http://www.amazon.com" });
		envs.add(new String[] { Platform.WINDOWS.toString(), "chrome", "http://www.facebook.com" });
		envs.add(new String[] { Platform.WINDOWS.toString(), "opera", "http://www.fanniemae.com" });
		envs.add(new String[] { Platform.WINDOWS.toString(), "firefox", "http://www.fanniemae.com" });

		return envs;
	}

	// Constructor - Used to drive the series of test through each of the
	// browsers (the Data).
	public JUnitDataDrivenTest(String platform, String browser, String aut) {
		this.platform = platform;
		this.browser = browser;
		this.aut = aut;
	}

	private WebDriver driver;
	private String baseURL;

	@Before
	public void setup() throws Exception {
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
		System.out.println("Browser: "+ browser + " - Navigated to: " + aut + "- Page Title is: " + actualPageTitle);
	}

	@After
	public void teardown() {
		driver.quit();
	}
}
