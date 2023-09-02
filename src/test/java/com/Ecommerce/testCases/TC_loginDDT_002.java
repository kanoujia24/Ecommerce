package com.Ecommerce.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Ecommerce.pageObject.loginPage;
import com.Ecommerce.utilities.XLUtils;

public class TC_loginDDT_002 extends baseClass {
	
	@Test(dataProvider="loginData")
	public void loginData(String user,String pass){
		loginPage lp=new loginPage(driver);
		lp.setName(user);
		logger.info("user name given");
		lp.setPassword(pass);
		logger.info("password given");
		lp.submit();
		
		
		if(noAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warning("login fail");
			}
		else  {
			Assert.assertTrue(true);
			lp.ClickLogOut();
			logger.info("login is successful");
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	
	public boolean noAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
			}
		catch(NoAlertPresentException e) {//user define method to check weather alert is present or not
			return false;
		}
	}
	
    @DataProvider(name="loginData")
    String[][] getData() throws IOException{
    	String path=System.getProperty("user.dir")+"\\src\\test\\java\\com\\Ecommerce\\testData\\LoginData.xlsx";
    	int rowcount=XLUtils.getRowCount(path,"sheet1");
    	int cellcount=XLUtils.getCellCount(path,"sheet1", rowcount);
    	String loginData[][]=new String[rowcount][cellcount];
    	for(int i = 1;i<=rowcount;i++) {
    		for(int j=0;j<cellcount;j++) {
    			loginData [i-1][j]=XLUtils.getCellData(path, "sheet1", i, j);
    		}
    	}
    	return loginData;
    }
}
