package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {
static WebDriver driver;
	public static void main(String[] args) {

		BrowserUtils br=new BrowserUtils();
		driver=br.launchBrowser("chrome");
		br.openURL("https://www.orangehrm.com/en/30-day-free-trial");
		
		//WebElement country= driver.findElement(By.id("Form_getForm_Country"));
		//Select select=new Select(country);
		
//		select.selectByIndex(2);
//		select.selectByVisibleText("Australia");
//		select.selectByValue("India");
		
		By country=By.id("Form_getForm_Country");
		doSelectByIndex(country,5);
		doSelectByVisibleText(country, "Australia");
		doSelectByValue(country, "India");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
		}
	
	public static void doSelectByVisibleText(By locator,String text) {
		nullCheck(text);
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectByValue(By locator,String value) {
		nullCheck(value);
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void nullCheck(String text) {
		if(text==null||text.length()==0) {
			throw new ElementException(text+"value text can't be null");
		}
	}

}
