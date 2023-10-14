package com.Crm.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Crm.pageObject.LoginPage;
import com.Crm.utilities.XLUtils;
public class TC_LoginDDT_002 extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String password, String exp) throws InterruptedException{
		
		
		LoginPage  lp=new LoginPage(driver);
		
		lp.setUserName(user);
		Thread.sleep(3000);
		logger.info("user name is mentioned");
		
		
		lp.setPassword(password);
		logger.info("password is mentioned");
		
		
		lp.clickSubmit();
		logger.info("Login button clicked");
		
		Thread.sleep(3000);
		
		String exp_Url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String act_Url=driver.getCurrentUrl();
		
		if(exp.equals("Valid"))
		{
			if(exp_Url.equals(act_Url))
			{
				Assert.assertTrue(true);
				logger.info("Login passed");
				logger.warn("-------------------------------------------------");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
				driver.findElement(By.xpath("(//li/a)[16]")).click();

				
			}
			else
			{
				Assert.assertTrue(false);
				logger.warn("Login Failed");
				logger.warn("-------------------------------------------------");
		    	}
	    	}
		else if(exp.equals("Invalid"))
		{
			if(exp_Url.equals(act_Url))
			{
				Assert.assertTrue(false);
				logger.info("Login passed");
				logger.warn("-------------------------------------------------");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
				driver.findElement(By.xpath("(//li/a)[16]")).click();
				
				
			}
			else
			{
				Assert.assertTrue(true);
				logger.warn("Login Failed");
				logger.warn("-------------------------------------------------");
				Assert.assertTrue(true);
			}
		}
 	}

	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
	String path= "./data/LoginCRM.xlsx";

	
	int rownum=XLUtils.getRowCount(path,"Sheet1");
	int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
	
	String logindata[][]= new String[rownum] [colcount];
	
	for(int i=1;i<=rownum;i++) {
		
		for(int j=0;j<colcount;j++) {
			logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
		}
	}
	return logindata; 	
	}

}
