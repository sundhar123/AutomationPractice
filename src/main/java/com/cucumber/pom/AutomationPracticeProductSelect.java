package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeProductSelect{
public WebDriver driver;
public AutomationPracticeProductSelect(WebDriver a3driver) {
	
	
	this.driver = a3driver;
	PageFactory.initElements(driver, this);
    }

	
	@FindBy(xpath = "//a[@title = 'Women']")
	private WebElement WomenMouseOver;

	@FindBy(xpath = "//a[@title = 'Evening Dresses'][1]")
	private WebElement EveningDressClick;
	
	@FindBy(xpath = "//img[@title= 'Printed Dress']")
	private WebElement PrintedDressMouseOver;
	
	@FindBy(xpath = "//a[@title= 'Add to cart']")
	private WebElement AddtoCartClick;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement ProceedtoSummaryCheckout;
	
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement ProceedtoAddressCheckout; 
		
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	private WebElement ProceedtoShippingCheckout;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/p[2]/label")
	private WebElement ClickCheckBox;
	
	@FindBy(xpath = "//a[@title ='Previous']")
	private WebElement ProceedtoPaymentCheckout;
	
	@FindBy(xpath = "//*[@id=\"order\"]/div[2]/div/div/a")
	private WebElement CloseIcon;
		
		
	@FindBy(xpath ="//a[@title = 'View my customer account']")
	private WebElement UserNameDisplayed;
	
	
	@FindBy(xpath = "//button[@name = 'submit_search']")
	private WebElement SearchIconHeader;
	
	@FindBy(xpath = "//*[@id=\"search_query_top\"]")
	private WebElement SearchFieldHeader;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement PrintedSummerDress;
	
	@FindBy(xpath = "//a[@title = 'Add to cart']")
	private WebElement AddtoCart;
	
	@FindBy(xpath = "//a[@class = 'logout']")
	private WebElement ClickSignOutButton;
	
	
	public WebElement getWomenMouseOver() {
		return WomenMouseOver;
	}

	public WebElement getEveningDressClick() {
		return EveningDressClick;
	}

	public WebElement getPrintedDressMouseOver() {
		return PrintedDressMouseOver;
	}

	public WebElement getAddtoCartClick() {
		return AddtoCartClick;
	}

	public WebElement getProceedtoSummaryCheckout() {
		return ProceedtoSummaryCheckout;
	}
	
	public WebElement getProceedtoAddressCheckout() {
		return ProceedtoAddressCheckout;
	}

	public WebElement getProceedtoShippingCheckout() {
		return ProceedtoShippingCheckout;
	}
	
	public WebElement getClickCheckBox() {
		return ClickCheckBox;
	}

	public WebElement getProceedtoPaymentCheckout() {
		return ProceedtoPaymentCheckout;
	}
	
	public WebElement getCloseIcon() {
		return CloseIcon;
	}

	
	
	public WebElement getClickSignOutButton() {
		return ClickSignOutButton;
	}
		
	public WebElement getSearchFieldHeader() {
		return SearchFieldHeader;
	}


	public WebElement getPrintedSummerDress() {
		return PrintedSummerDress;
	}

	public WebElement getSearchIconHeader() {
		return SearchIconHeader;
	}



	public WebElement getUserNameDisplayed() {
		return UserNameDisplayed;
	}


	@FindBy(xpath = "//*[@id=\"center_column\"]/div/p/a")
	private WebElement ContinueShopping;
	
	
	public WebElement getContinueShopping() {
		return ContinueShopping;
	}

	public WebElement getAddtoCart() {
		return AddtoCart;
	}

}
	
