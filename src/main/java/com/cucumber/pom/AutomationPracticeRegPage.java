package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeRegPage {
	
	
			
		public WebDriver driver;
		public AutomationPracticeRegPage(WebDriver a2driver) {
			
			this.driver = a2driver;
			PageFactory.initElements(driver, this);
		
		}
		
		
		
		@FindBy(xpath = "//input[@id = 'id_gender1']")
		private WebElement RadioBtnClick;
		
		public WebElement getRadioBtnClick() {
			return RadioBtnClick;
		}


		public WebElement getFirstNameinputfield() {
			return FirstNameinputfield;
		}


		public WebElement getLastNameinputfield() {
			return LastNameinputfield;
		}


		public WebElement getPasswordinputfield() {
			return Passwordinputfield;
		}


		public WebElement getDayDDinputfield() {
			return DayDDinputfield;
		}


		public WebElement getMonthDDinputfield() {
			return MonthDDinputfield;
		}


		public WebElement getYearDDinputfield() {
			return YearDDinputfield;
		}


		public WebElement getCompanyinputfield() {
			return Companyinputfield;
		}


		public WebElement getAddress1inputfield() {
			return Address1inputfield;
		}


		public WebElement getAddress2inputfield() {
			return Address2inputfield;
		}


		public WebElement getCityinputfield() {
			return Cityinputfield;
		}


		public WebElement getStateinputfield() {
			return Stateinputfield;
		}


		public WebElement getPostcodeinputfield() {
			return Postcodeinputfield;
		}


		public WebElement getAddinfoinputfield() {
			return Addinfoinputfield;
		}


		public WebElement getHomePhoneinputfield() {
			return HomePhoneinputfield;
		}


		public WebElement getMobileomePhoneinputfield() {
			return MobileomePhoneinputfield;
		}


		public WebElement getAssignAddress3inputfield() {
			return AssignAddress3inputfield;
		}


		public WebElement getRegisterinputfield() {
			return Registerinputfield;
		}


		public WebElement getWomenMousehover() {
			return WomenMousehover;
		}


		public WebElement getCasualDressclick() {
			return CasualDressclick;
		}


		public WebElement getProductdressclick() {
			return Productdressclick;
		}


		public WebElement getAddtoCartclick() {
			return AddtoCartclick;
		}


		public WebElement getProceedclick() {
			return Proceedclick;
		}


		public WebElement getCheckoutclick() {
			return Checkoutclick;
		}



		@FindBy(xpath = "//input[@id = 'customer_firstname']")
		private WebElement FirstNameinputfield;
		
		@FindBy(xpath = "//input[@id = 'customer_lastname']")
		private WebElement LastNameinputfield;
		
		@FindBy(xpath = "//input[@id = 'passwd']")
		private WebElement Passwordinputfield;
		
		
		@FindBy(xpath = "//select[@id = 'days']")
		private WebElement DayDDinputfield;
		
		
		@FindBy(xpath = "//select[@id = 'months']")
		private WebElement MonthDDinputfield;
		
		@FindBy(xpath = "//select[@id = 'years']")
		private WebElement YearDDinputfield;
		
		@FindBy(xpath = "//input[@id='company']")
		private WebElement Companyinputfield;
		
		@FindBy(xpath = "//input[@id ='address1']")
		private WebElement Address1inputfield;
		
		@FindBy(xpath = "//input[@id ='address2']")
		private WebElement Address2inputfield;
		
		
		@FindBy(xpath = "//input[@id = 'city']")
		private WebElement Cityinputfield;
		
		@FindBy(xpath = "//select[@id = 'id_state']")
		private WebElement Stateinputfield;	
		
		
		@FindBy(xpath = "//input[@id ='postcode']")
		private WebElement Postcodeinputfield;
		
		@FindBy(xpath = "//select[@id = 'other']")
		private WebElement Addinfoinputfield;
		
		@FindBy(xpath = "//input[@id = 'phone']")
		private WebElement HomePhoneinputfield;
		
		@FindBy(xpath = "//input[@id = 'phone_mobile']")
		private WebElement MobileomePhoneinputfield;
		
		@FindBy(xpath = "//input[@id ='alias']")
		private WebElement AssignAddress3inputfield;
		
		//button[@class = 'btn btn-default button button-medium']
		
		@FindBy(xpath = "//button[@class = 'btn btn-default button button-medium']")
		private WebElement Registerinputfield;
		
		@FindBy(xpath = "//a[@title = 'Women']")
		private WebElement WomenMousehover;
		
		//a[@title = 'Casual Dresses']
		
		@FindBy(xpath = "//a[@title = 'Casual Dresses']")
		private WebElement CasualDressclick;
		
		
		@FindBy(xpath = "//a[@class = 'product_img_link']")
		private WebElement Productdressclick;
		
		@FindBy(xpath = "//*[@id=\\\"center_column\\\"]/ul/li/div/div[2]/div[2]/a[1]]")
		private WebElement AddtoCartclick;
		
		
		@FindBy(xpath = "//*[@id=\\\"layer_cart\\\"]/div[1]/div[2]/div[4]/a")
		private WebElement Proceedclick;
		
		
		@FindBy(xpath = "//a[@class=\\\"button btn btn-default standard-checkout button-medium\\")
		private WebElement Checkoutclick;
		
	
		
		

}
