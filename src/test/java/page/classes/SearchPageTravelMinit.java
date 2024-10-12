package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageTravelMinit {
	public static WebElement element = null;
	
	//Box field for Destination
	public static WebElement theDestionation (WebDriver driver) {
		element = driver.findElement(By.id("location_header_input"));
		return element;
	}
	
	public static void fillTheDestination (WebDriver driver, String destination) {
		element = theDestionation(driver);
		element.sendKeys(destination);
	}
	
	public static WebElement UnitatiDeCazareRezervateAcum (WebDriver driver) {
		element = driver.findElement(By.xpath("//h3[text()='Unități de cazare rezervate acum']"));
		return element;
	}
}
