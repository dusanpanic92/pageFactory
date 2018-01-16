package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AbstractTestDriver {

	protected WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@After
	public void shutDown() {
		driver.close();
	}

}
