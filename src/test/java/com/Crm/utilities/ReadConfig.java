package com.Crm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig(){
		
		File src=new File("./configurations/config.properties");
	
	
	try {
		FileInputStream fis=new FileInputStream(src);
		pro= new Properties();
		pro.load(fis);
		
	}
	catch(Exception e){
		System.out.println("Exception is "+ e.getMessage());
	  }
	
   }
	
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String un=pro.getProperty("un");
		return un;
	}
	
	public String getPassword() {
		String pwd=pro.getProperty("pwd");
		return pwd;
	}
	
	public String getChromepath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxpath() {
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}

	


}
