package seleniumSessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement fname=driver.findElement(By.cssSelector("#input-firstname"));
		
		Thread.sleep(2000);
		String leftel=driver.findElement(with(By.xpath("//label[@for='input-firstname']")).toLeftOf(fname)).getText();
		System.out.println(leftel);
		
		String bel=driver.findElement(with(By.xpath("//label[@for='input-lastname']")).below(fname)).getText();
		System.out.println(bel);
		
		List<WebElement> rac=driver.findElements(with(By.tagName("a")).below(driver.findElement(By.linkText("Login"))));
		
		for(WebElement e:rac) {
		System.out.println(e.getText());
		}
		
		
		
		
		//.above(driver.findElement(By.linkText("Forgotten Password")))
	}

}
