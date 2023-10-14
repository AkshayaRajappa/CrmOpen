package com.Crm.testCases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Crm.pageObject.AddUserManagement;
import com.Crm.pageObject.LoginPage;

public class TC_AddUser_003 extends BaseClass {

	@Test
	public void addUser() throws InterruptedException, IOException {
	
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(un);
		logger.info("User Name Provided");
		lp.setPassword(pwd);
		logger.info("Password Provided");
		lp.clickSubmit();
		
		AddUserManagement adduse=new AddUserManagement(driver);
		Thread.sleep(3000);
		adduse.clickAdminModule();
		adduse.clickAddUser();
		logger.info("Providing new User Details ");
		adduse.clickRole();
		Thread.sleep(3000);
		adduse.clickAdm1();
		Thread.sleep(3000);
		adduse.clickRole();
		adduse.clickEs1();
		
		
		adduse.userEmpName("a");
		adduse.enterEmpName();
		adduse.clickStatus();
		adduse.clickAdm2();
		Thread.sleep(3000);
		adduse.clickStatus();	
		adduse.clickEs2();
		
		adduse.userName("Akshaya");
		adduse.userPassword("Ark@789");
		adduse.userConfPassword("Ark@789");
		adduse.clickSubmit();
		
		Thread.sleep(3000);
		
		logger.info("Validation Started............");
		boolean res = driver.getPageSource().contains("Success");
		
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("......test case passed.......");
		}
		else{
			captureScreen(driver,"addUser");
			Assert.assertFalse(false);
			logger.info("......test case failed.......");
		}
		
	}
	
}
