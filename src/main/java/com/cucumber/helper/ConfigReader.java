package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	public Properties pr = new Properties();
	
	public ConfigReader()throws Throwable {
		
		
		try {
			File propfile = new File(System.getProperty("user.dir") + 
					"\\src\\test\\resource\\com\\selenium\\properties\\Configuration.properties");
			FileInputStream fis = new FileInputStream(propfile);
			pr.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public String getBrowsername() throws Exception{
		
		String browser = pr.getProperty("BrowserName");
		
		if(browser == null) {
			throw new Exception("Enter a valid Browser Name");
		}
		
		return browser;
		}
		
		public String getUrl() throws Exception{
				
				String url = pr.getProperty("BrowserName");
				
				if(url == null) {
					throw new Exception("Enter a valid url");
				}
				
				return url;
			}
			
		public String getEmail() throws Exception{
			
			String email = pr.getProperty("Email");
			
			if(email == null) {
				throw new Exception("Enter a valid Email");
			}
			
			return email;
		}
		
		}
