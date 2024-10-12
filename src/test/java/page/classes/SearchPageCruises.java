package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageCruises {
	public static WebElement element = null;
	
	/** 
	* Return the cruise origin page element
	*@param driver
	* @return
	*/	
	public static void navigateToCruiseTab(WebDriver driver) {
		element = driver.findElement(By.id("onetrust-accept-btn-handler"));
		element.click();
		element = driver.findElement(By.xpath("//span[text()='Cruises']"));
		element.click();
	}
	
	//find the destination box
		public static void theDestinationCruises(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@data-stid='search-location']//button[@data-stid='destination_form_field-menu-trigger']"));
		element.click();
	}
	
	public static void fillTheDestinationCruises(WebDriver driver, String destination) {
		element = driver.findElement(By.xpath("//input[@id='destination_form_field']"));
		element.sendKeys(destination);
	}

	

	//Click on the departure Box
	public static WebElement searchTheDepartureBox(WebDriver driver) {
		element= driver.findElement(By.xpath("//button[@data-stid='uitk-date-selector-input1-default']"));
		return element;
	}
	
	//Fill the departure dates
	
	public static void fillTheDepartureDates(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@data-stid='month-table'][1]"));
		element.click();
//		element = driver.findElement(By.xpath("//div[@class='uitk-date-number uitk-date-number-default uitk-type-300 uitk-type-regular'][text()='30'][1]"));
//		element.click();
	}
	
	//click on done button
	public static void clickDoneButtonFromDeparturesDate (WebDriver driver) {
		element =driver.findElement(By.xpath("//button[@data-stid='apply-date-selector']"));
		element.click();
	}
	
	//find search button
	
	public static WebElement searchButton (WebDriver driver) {
		element = driver.findElement(By.id("search_button"));
		return element;
	}
	
	//click on search button
	
	public static void clickOnSearchButton (WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}
}
