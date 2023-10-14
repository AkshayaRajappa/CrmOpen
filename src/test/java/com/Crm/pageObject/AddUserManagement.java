package com.Crm.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddUserManagement {
	
WebDriver ldriver;
	
	public AddUserManagement(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="(//li)[1]")
	@CacheLookup
	WebElement lnkAdminModule;

	@FindBy(how = How.XPATH, using = "(//div/button)[6]")
	@CacheLookup
	WebElement lnkAddUser;

	@FindBy(how = How.XPATH, using = "(//div/i)[3]")
	@CacheLookup
	WebElement dropRole;

	@FindBy(how = How.XPATH, using = "(//div[@role='listbox']//child::div)[2]")
	@CacheLookup
	WebElement dropAdmin1;
	
	@FindBy(how = How.XPATH, using = "(//div[@role='listbox']//child::div)[3]")
	@CacheLookup
	WebElement dropEss1;
	

	
	/* @CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	WebElement txtdob;

	@CacheLookup
	@FindBy(how = How.NAME, using = "addr")
	WebElement txtaddress;   */

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//div/input)[2]")
	WebElement txtEmpName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//div[@role='listbox']//child::div)[2]")
	WebElement enterEmpName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//div/i)[4]")
	WebElement dropStatus;

	@FindBy(how = How.XPATH, using = "(//div[@role='listbox']//child::div)[2]")
	@CacheLookup
	WebElement dropAdmin2;
	
	@FindBy(how = How.XPATH, using = "(//div[@role='listbox']//child::div)[3]")
	@CacheLookup
	WebElement dropEss2;
	
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//div/input)[3]")
	WebElement txtUserName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//div/input)[4]")
	WebElement txtPwd;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//div/input)[5]")
	WebElement txtCnfPwd;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//button)[4]")
	WebElement txtSubmit;

	/* @CacheLookup
	@FindBy(how = How.ID, using = "sub")
	WebElement btnSubmit;   */
	
	public void clickAdminModule() {
		lnkAdminModule.click();
			
	}

	public void clickAddUser() {
		lnkAddUser.click();
		
	}

	public void clickRole() {
		dropRole.click();
	}
	
	public void clickAdm1() {
		dropAdmin1.click();
	}
	
	public void clickEs1() {
		dropEss1.click();
	}

	/* public void custdob(String mm,String dd,String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
		
	}  */

	public void userEmpName(String EmpName) {
		txtEmpName.sendKeys(EmpName);
	}

	public void enterEmpName() {
		enterEmpName.click();
	}
	
	public void clickStatus() {
		dropStatus.click();
	}
	
	public void clickAdm2() {
		dropAdmin2.click();
	}
	
	public void clickEs2() {
		dropEss2.click();
	}

	public void userName(String user) {
		txtUserName.sendKeys(user);
	}

	/* public void custpinno(String cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));
	}    */

	public void userPassword(String password) {
		txtPwd.sendKeys(password);
	}

	public void userConfPassword(String confpassword) {
		txtCnfPwd.sendKeys(confpassword);
	}

	public void clickSubmit() {
		txtSubmit.click();
	}

	/*  public void custsubmit() {
		btnSubmit.click();
	}   */
	
}
