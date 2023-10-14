package com.Crm.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Crm.pageObject.LoginPage;

public class TC_LoginPage_001 extends BaseClass {

	@Test
	 public void loginTest() throws InterruptedException, IOException {
		 
		 logger.info("URL is opened");
		 
		 LoginPage lg=new LoginPage(driver);
		 Thread.sleep(3000);
		 lg.setUserName(un);
		 logger.info("User name is Entered");
		 
		 lg.setPassword(pwd);
		 logger.info("Password is Entered");
		
		 lg.clickSubmit();
		 
   	 if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
			 
			 Assert.assertTrue(true);
			 logger.info("Login test Passed");
		 }
		 
		 else {
			 captureScreen(driver,"loginTest");
			 Assert.assertTrue(false);
			 logger.info("Login test Failed");
		 }   
 		 
	 }
}
