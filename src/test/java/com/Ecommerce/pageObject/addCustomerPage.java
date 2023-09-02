package com.Ecommerce.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addCustomerPage {
	
	WebDriver ldriver;
	public addCustomerPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	WebElement newCustomer;
	@FindBy(name="name")
	WebElement customerName;
	@FindBy(name="rad1")
	WebElement customerGender;
	@FindBy(name="dob")
	WebElement customerDOB;
	@FindBy(name="addr")
	WebElement customerAddress;
	@FindBy(name="city")
	WebElement customerCity;
	@FindBy(name="state")
	WebElement customerState;
	@FindBy(name="pinno")
	WebElement customerPin;
	@FindBy(name="telephoneno")
	WebElement customerTelephone;
	@FindBy(name="emailid")
	WebElement customerMail;
	@FindBy(name="password")
	WebElement customerpass;
	@FindBy(xpath="//input[@name='sub']")
	WebElement btnSubmit;
	
	
	
	
	public void custPage() {
		newCustomer.click();
	}
	public void custname(String cname) {
		customerName.sendKeys(cname);
	}
	public void custGender(String cgender) {
		customerGender.sendKeys(cgender);
	}
	public void custDOB(String dd,String mm,String yyyy) {
		customerDOB.sendKeys(dd);
		customerDOB.sendKeys(mm);
		customerDOB.sendKeys(yyyy);
	}
	public void custAdd(String cAdd) {
		customerAddress.sendKeys(cAdd);
	}
	public void custCity(String ccity) {
		customerCity.sendKeys(ccity);
    }
	public void custState(String cstate) {
		customerState.sendKeys(cstate);
    }
	public void custPin(String cpin) {
		customerPin.sendKeys(String.valueOf(cpin));//in case pin/other thing with integer code pass in integer form then this method chnage integer into string
		                              //sendkeys method accept only string
    }
	public void custTele(String ctele) {
		customerTelephone.sendKeys(ctele);
    }
	public void custMail(String cmail) {
		customerMail.sendKeys(cmail);
    }
	public void custpass(String cpass) {
		customerpass.sendKeys(cpass);
    }
	
	public void btnsub() {
		btnSubmit.click();
    }
}