package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;
	
	private By emailId = By.id("user-name");
	private By password = By.id("password");
	private By signInButton = By.id("login-button");
	
	
	public LoginPage(WebDriver driver) {
		
			this.driver = driver;
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isLoginButtonExist() {
		return driver.findElement(signInButton).isDisplayed();
	}
	
	public void enterUserName(String username) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(emailId)));
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterPassword(String pwd)  {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(password)));
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(signInButton).click();	
	}
	
	public AccountsPage doLogin(String un, String pwd) {
		
		System.out.println("Login with:"+ un +"and"+ pwd);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(emailId)));
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();
		return new AccountsPage(driver);
	}
}
