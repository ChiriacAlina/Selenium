package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactoryForFrameworkTestCase {
	WebDriver driver;
	
	@FindBy(id="onetrust-reject-all-handler")
	WebElement rejectAllCookies;
	
	@FindBy(xpath="//span[text()='Flights']")
	WebElement flightstab;
	
	@FindBy(xpath="//button[@data-stid='origin_select-menu-trigger']")
	WebElement flightDeparture;
	
	@FindBy(xpath="//button[@data-stid='destination_select-menu-trigger']")
	WebElement flightDestination;
	
	@FindBy(xpath="//button[@data-stid='uitk-date-selector-input1-default']")
	WebElement datesTab;
	
	@FindBy(xpath="//div[text()=31]")
	WebElement departureDate;
	
	@FindBy(xpath="//div[text()=10]")
	WebElement returnDate;
	
	@FindBy(xpath="//button[@data-stid='apply-date-selector']")
	WebElement doneButtonFromDates;
	
	@FindBy(id="search_button")
	WebElement searchButton;
	
	public SearchPageFactoryForFrameworkTestCase(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickRejectAllCookied() {
		rejectAllCookies.click();
	}
	
	public void clickFlightsTab() {
		flightstab.click();
	}
	
	public void setDeparture(String departure) {
		flightDeparture.sendKeys(departure);
	}
	
	public void setDestination(String destination) {
		flightDestination.sendKeys(destination);
	}

	public void clickOnDatesTab() {
	datesTab.click();
	}
	
	public void clickOnDepartureDate() {
		departureDate.click();
	}
	
	public void clickOnReturnDate() {
		returnDate.click();
	}

	public void clickOnDoneFromDates() {
		doneButtonFromDates.click();
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}
}
