package com.mydemo.utilities;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegressionTest1 {

	@Test
	public void test1() {
		  ChromeOptions chromeOptions = new ChromeOptions();
		  chromeOptions.setHeadless(true);

		  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/linux/chromedriver");
		  WebDriver driver = new ChromeDriver(chromeOptions);
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://demo.opencart.com/admin");

	}
}
