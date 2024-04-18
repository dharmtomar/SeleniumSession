package seleniumSessions;

import org.openqa.selenium.WebDriver;

public class LocatorStrategy {

	public static void main(String[] args) {
		WebDriver driver=null;
		
		BrowserUtils br=new BrowserUtils();
		driver=br.launchBrowser("chrome");
		br.openURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		ElementUtils eu=new ElementUtils(driver);
		//eu.doClick("xpath", "//*[@id=\"column-right\"]/div/a[1]");
		
		
	}

}
