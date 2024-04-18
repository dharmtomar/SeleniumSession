package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeys {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=information/contact");
		WebElement el=driver.findElement(By.cssSelector("#input-name"));
		Actions ac=new Actions(driver);
		ac.sendKeys(el, "dharm").perform();
		
		

	}

}
