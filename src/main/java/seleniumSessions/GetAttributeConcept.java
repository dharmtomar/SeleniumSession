package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttributeConcept {
public static WebDriver driver;

	public static void main(String[] args) {
		//to get the text- getText()
		//to get the attribute value- getAttribute()
		//fetching the data from application is called scraping i.e- getText(),getAttribute()
		BrowserUtils br=new BrowserUtils();
		driver=br.launchBrowser("chrome");
		br.openURL("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18");
		
		By todaydealLink=By.linkText("Laptops & Notebooks (5)");
		
		System.out.println(doGetAttribute(todaydealLink, "class"));
		System.out.println(doGetAttribute(todaydealLink, "href"));
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static String doGetAttribute(By locator,String attributeValue) {
		return getElement(locator).getAttribute(attributeValue);
	}
}
