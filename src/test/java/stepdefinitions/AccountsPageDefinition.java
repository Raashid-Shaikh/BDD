package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AccountsPage;
import pages.LoginPage;

public class AccountsPageDefinition {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountsPage;
	
		
		@Given("user has already logged in to the application")
		public void user_has_already_logged_in_to_the_application(DataTable credTable) {
			
		  List<Map<String, String>> credList =  credTable.asMaps();
		  String userName = credList.get(0).get("username");
		  String password = credList.get(0).get("password");
		  
		  DriverFactory.getDriver().get("https://www.saucedemo.com/");
		  

		
		  accountsPage = loginPage.doLogin(userName, password);

	
		  
		}
		
		@Given("user is on accounts page")
		public void user_is_on_accounts_page() {
			accountsPage.getAccountsPageTitle();
		}
		
		@Then("user gets account section")
		public void user_gets_account_section(DataTable sectionsTable) {
			List<String> expAccountSectionList = sectionsTable.asList();
			System.out.println(expAccountSectionList);
			
			List<String> actualAccountSectionList = accountsPage.getAccountsSectionList();
		    Assert.assertTrue(expAccountSectionList.containsAll(actualAccountSectionList));
		}
		
		@Then("accounts section count should be {int}")
		public void accounts_section_count_should_be(Integer expectedSectionCount) {
			Assert.assertTrue(accountsPage.getAccounts() == expectedSectionCount);
		}
		

}
