package com.cleartrip.tests;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utils.ReadLocatorsFile;

public class LoginDriver {
	public static WebDriver driver;
	public Properties properties;

	@Test
	public void launchDriver() throws Exception {
		properties = ReadLocatorsFile.loadProperty(
				"C:\\Users\\siva.mutyala\\eclipse-workspace\\com.cleartrip\\resources\\testdata\\cleartripdata.properties");
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		String url = properties.getProperty("url");

		driver.get(url);
	}
}
