package appHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.configReader;

public class ApplicationHooks {

	
	private DriverFactory driverFactory;
	private WebDriver driver;
	private configReader ConfigReader;
	Properties prop;
	
	@Before(order=0)
	public void getproperty() {
		ConfigReader = new configReader();
		prop = ConfigReader.init_prop();
		
	}
	
	@Before(order=1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
	}
	
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}
}
