Feature: Automation Practice End to End Test Automation Scenario
Scenario: Testing Automation
Given user hit the Automation Practice Website
When user verifies the site logo
And user verifies the page title present in the login page
Then user clicks on sign in button in header location of the button

Scenario: Verify user login with valid credentials
And user enter the email id in the login page
And user enter the password in the login page
And user click on login button in the login page
Then user verifies the username 

Scenario: Place the order for the product and execute the payment 
When user mousehover on the Women text button
And user click on the Evening Dress
And user mousehover on the Printed Dress
And user click on the Add to Cart
And user click on the Proceed to SummaryCheckout
And user click on the Proceed to AddressCheckout
And user click on the Proceed to ShippingCheckout
And user click on the Checkbox
Then user click on the Proceed to PaymentCheckout

Scenario: User place the second order and search the product
Given user hit the search Automation Practice Website 
When user click on the continue shopping button in the left bottom of the page
And user click on the search field in the header
And user enter the printed summer dresses in the input search field
Then user click the search icon next to input search field

Scenario: Select the product and execute the payment 
When user mousehover on the printed summer dress image
And user click on the Add to Cart button at the bottom of the image
And user click on the Proceed to Summary Page Checkout
And user click on the Proceed to Address Page Checkout
And user click on the Proceed to Shipping Page Checkout
And user click on the Checkbox button
Then user click on the Proceed to Payment page Checkout

Scenario: Verify user name present in the header
When user verifies the user name present in the header

Scenario: Verify the user signout the application
When user click the signout button in the header 