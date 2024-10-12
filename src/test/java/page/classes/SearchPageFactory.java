package page.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageFactory {
	
	@FindBy(xpath="//span[text()='Flights']")
	WebElement flightstab;
	
	@FindBy(xpath="//span[text()='Roundtrip']")
	WebElement roundtrip;
	
	@FindBy(xpath="//span[text()='Multi-city']")
	WebElement multicity;
	
	public void clickFlightTab() {
		flightstab.click();
	}
	
	public void clickRoundTrip () {
		roundtrip.click();
	}
	
	public void clickMultiCity() {
		multicity.click();
	}
}
