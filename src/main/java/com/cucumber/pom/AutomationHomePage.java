package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationHomePage {
	
	
	public WebDriver driver;
	public AutomationHomePage(WebDriver a1driver) {
		
		this.driver = a1driver;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath = "//a[@title = 'Log in to your customer account']")
	private WebElement SignInBtn;
	
	public WebElement getSignInBtn() {
		return SignInBtn;
	}
	
	@FindBy(xpath = "//img[@class = 'logo img-responsive']")
	private WebElement Websitelogo;
	
	public WebElement getWebsitelogo() {
		return Websitelogo;
	}


	
	



}
