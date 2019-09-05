package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.helper.FileDataManager;
import com.cucumber.helper.PageObjectManager;
import com.cucumber.pom.AutomationHomePage;
import com.cucumber.pom.AutomationPracticeProductSelect;
import com.cucumber.pom.AutomationSignInPage;
import com.cucumber.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class StepDefinition extends BaseClass{

	public static WebDriver driver = TestRunner.driver;
	public static PageObjectManager pm = new PageObjectManager(driver);
	
	
	@Given("^user hit the Automation Practice Website$")
	public void user_hit_the_Automation_Practice_Website() throws Throwable {
		driver = getBrowser("chrome");
		
		String Url = FileDataManager.fdm.getConfigReader().getUrl();
		getUrl(Url);
		//getUrl("http://automationpractice.com/index.php");   
	      
	}

	@When("^user verifies the site logo$")
	public void user_verifies_the_site_logo() throws Throwable {
		elementIsDisplayed(pm.getahp().getWebsitelogo());
	      
	}

	@When("^user verifies the page title present in the login page$")
	public void user_verifies_the_page_title_present_in_the_login_page() throws Throwable {
		AutomationHomePage ahp = new AutomationHomePage(driver);
		 getTitle();
		   
			if(getTitle().contains("My Store"))
				System.out.println(getTitle());
			else 
			{
				System.out.println("false");
			}} 
	

	@Then("^user clicks on sign in button in header location of the button$")
	public void user_clicks_on_sign_in_button_in_header_location_of_the_button() throws Throwable {
		clickOnWebElement(pm.getahp().getSignInBtn());
	      
	}

	@Given("^user enter the email id'(.*)' in the login page$")
	public void user_enter_the_email_id_in_the_login_page(String username) throws Throwable {
	      sendkeys(pm.getasip().getEmailIdInputBox2(), username);
	}

	@Given("^user enter the password'(.*)' in the login page$")
	public void user_enter_the_password_in_the_login_page(String password) throws Throwable {
		sendkeys(pm.getasip().getPasswordInputBox(), password);
	      
	}

	@Given("^user click on login button in the login page$")
	public void user_click_on_login_button_in_the_login_page() throws Throwable {
		clickOnWebElement(pm.getasip().getSignInButton1());
	      
	}

	@Then("^user verifies the username$")
	public void user_verifies_the_username() throws Throwable {
//		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver);  
		//String actual = apps.getUsernamedisplay().getText();
		//Assert.assertTrue(actual.contains("sundhar"));

	      
	}

	@When("^user mousehover on the Women text button$")
	public void user_mousehover_on_the_Women_text_button() throws Throwable {
		mousehover(pm.getapps().getWomenMouseOver());
	      
	}

	@When("^user click on the Evening Dress$")
	public void user_click_on_the_Evening_Dress() throws Throwable {
		clickOnWebElement(pm.getapps().getEveningDressClick());
	      
	}

	@When("^user mousehover on the Printed Dress$")
	public void user_mousehover_on_the_Printed_Dress() throws Throwable {
		mousehover(pm.getapps().getPrintedDressMouseOver());
	      
	}

	@When("^user click on the Add to Cart$")
	public void user_click_on_the_Add_to_Cart() throws Throwable {
		clickOnWebElement(pm.getapps().getAddtoCartClick());
	      
	}

	@When("^user click on the Proceed to SummaryCheckou$t")
	public void user_click_on_the_Proceed_to_SummaryCheckout() throws Throwable {
		clickOnWebElement(pm.getapps().getProceedtoSummaryCheckout());
	      
	}

	@When("^user click on the Proceed to AddressCheckout$")
	public void user_click_on_the_Proceed_to_AddressCheckout() throws Throwable {
		clickOnWebElement(pm.getapps().getProceedtoAddressCheckout());
	      
	}

	@When("^user click on the Proceed to ShippingCheckout$")
	public void user_click_on_the_Proceed_to_ShippingCheckout() throws Throwable {
			
		clickOnWebElement(pm.getapps().getProceedtoShippingCheckout());
	      
	}

	@When("^user click on the Checkbox$")
	public void user_click_on_the_Checkbox() throws Throwable {
		clickOnWebElement(pm.getapps().getClickCheckBox());
	      
	}

	@Then("^user click on the Proceed to PaymentCheckout$")
	public void user_click_on_the_Proceed_to_PaymentCheckout() throws Throwable {
		clickOnWebElement(pm.getapps().getProceedtoPaymentCheckout());
	      
	}

	@Given("^user hit the Automation Practice Website$")
	public void user_hit_the_search_Automation_Practice_Website() throws Throwable {
		driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php?controller=order&step=1&multi-shipping=");   
	      
	}

	
	@When("^user click on the continue shopping button in the left bottom of the page$")
	public void user_click_on_the_continue_shopping_button_in_the_left_bottom_of_the_page() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver);  
	      clickOnWebElement(apps.getContinueShopping());
	}

	@When("^user click on the search field in the header$")
	public void user_click_on_the_search_field_in_the_header() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver);  
	    clickOnWebElement(apps.getSearchFieldHeader());  
		sendkeys(apps.getSearchFieldHeader(), "Printed Summer Dresses");
	}

	@When("^user enter the printed summer dresses in the input search field$")
	public void user_enter_the_printed_summer_dresses_in_the_input_search_field() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver);
	      clickOnWebElement(apps.getPrintedSummerDress());
	}

	@Then("^user click the search icon next to input search field$")
	public void user_click_the_search_icon_next_to_input_search_field() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver); 
	      clickOnWebElement(apps.getSearchIconHeader());
	}
	
	
	

	@When("^user mousehover on the printed summer dress image$")
	public void user_mousehover_on_the_printed_summer_dress_image() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver);
	      mousehover(apps.getPrintedDressMouseOver());
	}

	@When("^user click on the Add to Cart button at the bottom of the image$")
	public void user_click_on_the_Add_to_Cart_button_at_the_bottom_of_the_image() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver);
	      clickOnWebElement(apps.getAddtoCartClick());
	}

	@When("^user click on the Proceed to Summary Page Checkout$")
	public void user_click_on_the_Proceed_to_Summary_Page_Checkout() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver);  
	      clickOnWebElement(apps.getProceedtoSummaryCheckout());
	}

	@When("^user click on the Proceed to Address Page Checkout$")
	public void user_click_on_the_Proceed_to_Address_Page_Checkout() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver);
	      clickOnWebElement(apps.getProceedtoAddressCheckout());
	}

	@When("^user click on the Proceed to Shipping Page Checkout$")
	public void user_click_on_the_Proceed_to_Shipping_Page_Checkout() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver);
	      clickOnWebElement(apps.getProceedtoShippingCheckout());
	}

	@When("^user click on the Checkbox button$")
	public void user_click_on_the_Checkbox_button() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver);  
	      clickOnWebElement(apps.getClickCheckBox());
	}

	@Then("^user click on the Proceed to Payment page Checkout$")
	public void user_click_on_the_Proceed_to_Payment_page_Checkout() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver); 
	      clickOnWebElement(apps.getProceedtoPaymentCheckout());
	}

	@When("^user verifies the user name present in the header$")
	public void user_verifies_the_user_name_present_in_the_header() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver);
		apps.getUserNameDisplayed();
		System.out.println("checking");
	}

	@When("^user click the signout button in the header$")
	public void user_click_the_signout_button_in_the_header() throws Throwable {
		AutomationPracticeProductSelect apps = new AutomationPracticeProductSelect(driver);
	      clickOnWebElement(apps.getClickSignOutButton());
	      System.out.println("Task Completed");
	}
	
	
	
	
	
	

}
