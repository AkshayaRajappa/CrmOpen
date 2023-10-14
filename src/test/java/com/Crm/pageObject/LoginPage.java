package com.Crm.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	
	WebDriver ldriver;
	
	 public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(tagName ="button")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(className = "oxd-userdropdown-tab")
	@CacheLookup
	WebElement lnkDropdown;
	
	@FindBy(linkText = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/logout")
	@CacheLookup
	WebElement lnkLogout;
	
	public void setUserName(String un) {
		txtUserName.sendKeys(un);
		
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
		
	}
	
	public void clickSubmit() {
		btnLogin.click();
		
	}
	
    public void clickDropdown() {
		lnkDropdown.click();
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}
	
	
}

