package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	
	public WebDriver init_driver(String browser) {
		System.out.println("browser value is:" + browser);
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				tldriver.set(new FirefoxDriver());
			}
		else if(browser.equals("safari")) {
			tldriver.set(new SafariDriver());
		}
		else {
			System.out.println("Browser value required");
		}
		
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	//hold the reference to the value of webdriver instance during runtime
	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}

}
