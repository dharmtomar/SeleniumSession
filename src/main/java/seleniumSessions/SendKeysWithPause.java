package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/");
//		
//		WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Search']"));
//		String str="automation";
//		char val[]=str.toCharArray();
//		
//		Actions act=new Actions(driver);
//		for(char ch:val) {
//			act.sendKeys(ele, String.valueOf(ch)).pause(500).perform();
//		}
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Actions act=new Actions(driver);
		act.sendKeys(driver.findElement(By.id("input-firstname")), "dharm")
		.sendKeys(Keys.TAB)
		
		.sendKeys("tomar")
		.sendKeys(Keys.TAB)
		.sendKeys("dharm@gmail.com")
		.sendKeys(Keys.TAB)
		.sendKeys("1234567890")
		.sendKeys(Keys.TAB)
		.sendKeys("test@12345").perform();	
	}

}
