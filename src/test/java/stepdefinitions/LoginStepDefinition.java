package stepdefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;

public class LoginStepDefinition {
		
		private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
		private static String title;
		
			@Given("user is on login page")
			public void user_is_on_login_page() {
				DriverFactory.getDriver().get("https://www.saucedemo.com/");
			   
				
			}
			
			@When("user gets the title of the page")
			public void user_gets_the_title_of_the_page() {
				title = loginPage.getLoginPageTitle();
				System.out.println("Page title is "+title);
			}
			
			@Then("page title should be {string}")
			public void page_title_should_be(String expecteTitleName) {
				
				Assert.assertTrue(title.contains(expecteTitleName));
			}
			
			@Then("login button should be displayed")
			public void login_button_should_be_displayed() {
			    Assert.assertTrue(loginPage.isLoginButtonExist());
			}
			
			@When("user enters username {string}")
			public void user_enters_username(String username) throws InterruptedException {
			   loginPage.enterUserName(username);
			}
			
			@When("user enters password {string}")	
			public void user_enters_password(String password) throws InterruptedException {
			    loginPage.enterPassword(password);
			}
			
			@When("user clicks on Login button")
			public void user_clicks_on_login_button() {
			   loginPage.clickOnLogin();
			}
			
			
			

}
