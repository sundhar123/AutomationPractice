package com.cucumber.helper;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.AutomationHomePage;
import com.cucumber.pom.AutomationPracticeProductSelect;
import com.cucumber.pom.AutomationSignInPage;

public class PageObjectManager {
	
	public WebDriver driver;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
		
	}
	private AutomationHomePage ahp;
	private AutomationSignInPage asip;
	private AutomationPracticeProductSelect apps;
	
	public AutomationHomePage getahp() {
		
		if (ahp == null) {
			ahp = new AutomationHomePage(driver);
			
		}
		return ahp;
	}
	
	public AutomationSignInPage getasip() {
		
		if (asip == null) {
			asip = new AutomationSignInPage(driver);
			
		}
		return asip;
	}
	
	
	public AutomationPracticeProductSelect getapps() {
		
		if (apps == null) {
			apps = new AutomationPracticeProductSelect(driver);
			
		}
		return apps;
	}
	
	

}
