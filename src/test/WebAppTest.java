package test;

import org.junit.Test;

import page.HomePage;

public class WebAppTest extends AbstractTestDriver {

	@Test
	public void shouldPerformSimpleClick() {
		HomePage homePage = new HomePage(driver);
		homePage.navigateToWebApp().navigateToContactPage().navigateToHomePage();
	}

}
