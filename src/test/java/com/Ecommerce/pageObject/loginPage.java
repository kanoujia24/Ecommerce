package com.Ecommerce.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver ldriver;
	public loginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	@FindBy(xpath="/html/body/div[3]/div/ul/li[10]/a")
	WebElement linkLogOut;
	
	public void setName(String name) {
		userName.sendKeys(name);
	} 
	public void setPassword (String pswrd) {
		password.sendKeys(pswrd);
	}
	public void submit() {
		btnlogin.click();
	}
	public void ClickLogOut() {
		linkLogOut.click();
	}
}