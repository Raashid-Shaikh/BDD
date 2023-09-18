package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	
	private WebDriver driver;
	
	private By accountsSections = By.xpath("//div[@class='inventory_item_name']");


	public AccountsPage(WebDriver driver) {
		
			this.driver = driver;
	}
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}
	
	public int getAccounts() {
		return driver.findElements(accountsSections).size();
	}
	
	
		
	
	public List<String> getAccountsSectionList() {
		
		List<String> accountsList = new ArrayList<>();
		List<WebElement> accountsHeaderList = driver.findElements(accountsSections);
		
		for(WebElement e: accountsHeaderList) {
			String text = e.getText();
			System.out.println(text);
			accountsList.add(text);
		}
		
		return accountsList;
		}
}
