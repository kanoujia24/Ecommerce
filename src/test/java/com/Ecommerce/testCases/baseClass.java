package com.Ecommerce.testCases;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.Ecommerce.utilities.ReadConfig;

public class baseClass {

	ReadConfig readconfig = new ReadConfig();

	public String baseUrl = readconfig.getApplicatinUrl();
	public String userName = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setUp(@Optional("firefox") String browser) {

		logger = Logger.getLogger("Ecommere");
		// PropertyConfigurator.configure("log4j.properties");

		if (browser.equals("firefox")) {
			System.setProperty("WebDriver.gecko.driver", readconfig.getGeckoPth());
			driver = new FirefoxDriver();
		} else {
			System.setProperty("WebDriver.chrome.driver", readconfig.getChromePath());
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public String randomString() {
		String generated = RandomStringUtils.randomAlphabetic(10);
		return generated;

	}

	public String randomnUM() {
		String generated1 = RandomStringUtils.randomNumeric(10);
		return generated1;

	}

}
