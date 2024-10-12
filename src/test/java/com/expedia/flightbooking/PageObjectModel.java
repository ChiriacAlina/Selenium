package com.expedia.flightbooking;

import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import page.classes.*;

public class PageObjectModel {
	private WebDriver driver;
	private String baseUrl;
	
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	@Test
	public void test() {
		driver.get(baseUrl);
		SearchPage.navigateToFlightsTab(driver);
		SearchPage.fillOriginTextBox(driver, "New York");
//		SearchPage.fillDestinationTextBox(driver, "Chicago");
//		SearchPage.fillDepartureDateTextBox(driver, "12/25/2024");;
//		SearchPage.fillReturnDateTextBox(driver, "12/31/2024");
//		SearchPage.clickOnSearchButton(driver);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
