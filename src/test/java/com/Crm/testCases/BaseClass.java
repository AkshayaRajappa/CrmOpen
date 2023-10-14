package com.Crm.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.Crm.utilities.ReadConfig;

public class BaseClass {
	
	   ReadConfig readconfig=new ReadConfig();
      	public  String baseURL = readconfig.getApplicationURL();
	 	
 	public String un = readconfig.getUsername();
	public String pwd =readconfig.getPassword(); 
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	@Parameters("browser")
	public  void setup(@Optional("Chrome") String br) throws InterruptedException {
		
	    logger=Logger.getLogger(BaseClass.class);
	    PropertyConfigurator.configure("log4j.properties");
	 
	    if(br.equals("Chrome"))
	    {
	    System.setProperty("webdriver.chrome.driver", readconfig.getChromepath()); 
		driver= new ChromeDriver();
	    }
	    
	    else if(br.equals("firefox")) {
	    	   System.setProperty("webdriver.gecko.driver", readconfig.getChromepath()); 
	   		driver= new FirefoxDriver();
	    }
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(baseURL);
	    
	}
	
	
	
	 @AfterClass
	public  void tearDown() {
		driver.quit();
	}  
	 
	 public void captureScreen(WebDriver driver, String tname) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken");
		}
}
