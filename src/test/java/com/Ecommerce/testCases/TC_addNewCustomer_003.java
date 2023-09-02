package com.Ecommerce.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ecommerce.pageObject.addCustomerPage;
import com.Ecommerce.pageObject.loginPage;

import net.bytebuddy.utility.RandomString;

public class TC_addNewCustomer_003 extends baseClass {

	@Test
	public void addNewCustomer() throws InterruptedException {

		loginPage lp = new loginPage(driver);
		lp.setName(userName);
		lp.setPassword(password);
		lp.submit();

		Thread.sleep(5000);
		addCustomerPage newCust = new addCustomerPage(driver);
		newCust.custPage();
		newCust.custname("deepak");
		newCust.custGender("male");
		newCust.custDOB("15", "10", "1992");
		newCust.custAdd("lucknow");
		newCust.custCity("kakori");
		newCust.custState("UP");
		newCust.custPin("226101");
		newCust.custTele("9336457660");

		newCust.btnsub();

		String mail = randomString() + "@gmail.com";// called here the randomString method and concat with gmail.com and
													// store in varibale "mail"
		newCust.custMail(mail);
		newCust.custpass("deepak@24");
		newCust.btnsub();

		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if (res == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
