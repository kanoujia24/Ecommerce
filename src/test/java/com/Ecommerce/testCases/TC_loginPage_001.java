package com.Ecommerce.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ecommerce.pageObject.loginPage;


public class TC_loginPage_001 extends baseClass {
	
	@Test
	public void loginTest() {
		logger.info("url is open");
		
		loginPage lp=new loginPage(driver);
		lp.setName(userName);
		logger.info("username intered");
		
		lp.setPassword(password);
		logger.info("password entered");
		
		lp.submit();
		//driver.getTitle();
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("test case passe");
		}
		else {
			Assert.assertTrue(false);
			logger.info("test case fail");
		}
		
	}

}
