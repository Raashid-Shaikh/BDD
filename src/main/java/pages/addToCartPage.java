package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addToCartPage {

	private WebDriver driver;
	private By addButton = By.id("add-to-cart-sauce-labs-backpack");
	private By cartButton = By.id("shopping_cart_container");
	private By CarProductTitles = By.xpath("//div[@class='inventory_item_name']");
	private By addButton2 = By.id("add-to-cart-sauce-labs-fleece-jacket");
	public addToCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addProduct() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(addButton)));
		driver.findElement(addButton).click();
		Thread.sleep(2000);
		driver.findElement(addButton2).click();
		Thread.sleep(2000);
		
	}
	
	public void clickOnCart() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(cartButton)));
		
		driver.findElement(cartButton).click();
	}
	
	public List<String> CartIncludedProducts() {
		
			List<String> ProductList = new ArrayList<>();
			List<WebElement> ProductTitle = driver.findElements(CarProductTitles);
			
			for(WebElement e:ProductTitle) {
				String text = e.getText();
				System.out.println(text);
				ProductList.add(text);
				
			}
			return ProductList;
	}
	
	
	
	
	
}

