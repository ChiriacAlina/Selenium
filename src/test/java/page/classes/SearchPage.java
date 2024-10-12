package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	public static WebElement element = null;

	/** 
	* Return the flight origin text box element
	*@param driver
	* @return
	*/
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@data-stid='origin_select-dialog-trigger']"));
		return element;
	}
	
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.sendKeys(origin);
	}
	
	/** 
	* Return the flight destination text box element
	*@param driver
	* @return
	*/
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@data-stid='destination_select-dialog-trigger']"));
		return element;
	}
	
	public static void fillDestinationTextBox(WebDriver driver, String origin) {
		element = destinationTextBox(driver);
		element.sendKeys(origin);
	}
	
	/** 
	* Return the departure date text box element
	*@param driver
	* @return
	*/
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@data-stid='uitk-date-selector-input1-default']"));
		return element;
	}
	
	public static void fillDepartureDateTextBox(WebDriver driver, String origin) {
		element = departureDateTextBox(driver);
		element.sendKeys(origin);
	}
	
	/** 
	* Return the return date text box element
	*@param driver
	* @return
	*/
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='uitk-sheet-content']"));
		return element;
	}
	
	public static void fillReturnDateTextBox(WebDriver driver, String origin) {
		element = returnDateTextBox(driver);
		element.sendKeys(origin);
	}
	
	/** 
	* Return the search button box element
	*@param driver
	* @return
	*/
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.id("search_button"));
		return element;
	}
	
	/** 
	* Click on search button box element
	*@param driver
	*/
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}
	
	/** 
	* Navigate to flights tab
	*@param driver
	*/
	public static void navigateToFlightsTab(WebDriver driver) {
		driver.findElement(By.id("onetrust-reject-all-handler")).click();
		element = driver.findElement(By.xpath("//span[text()='Flights']"));
		element.click();
	}
	
}
