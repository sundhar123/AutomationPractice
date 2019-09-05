package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationSignInPage {
	
		
	   public WebDriver driver;
	   public AutomationSignInPage(WebDriver a2driver) {
		
	   this.driver = a2driver;
	   PageFactory.initElements(driver, this);	
		
	   }
	   	 	
	    @FindBy(xpath = "//input[@id = 'email']")
		private WebElement EmailIdInputBox2;

		@FindBy(xpath = "//input[@id = 'passwd']")
		private WebElement PasswordInputBox;
					
		@FindBy(xpath = "//button[@id = 'SubmitLogin']")
		private WebElement signInButton1;
		
		public WebElement getEmailIdInputBox2() {
			return EmailIdInputBox2;
		}

		public WebElement getPasswordInputBox() {
			return PasswordInputBox;
		}

		public WebElement getSignInButton1() {
			return signInButton1;
		}
	   
	   
		
	}