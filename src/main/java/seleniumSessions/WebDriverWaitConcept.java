package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		//wait(I) -->until(); -- FluentWait(C) --> (@overidden)until(){} + other methods -- WebDriverWait(C) -->no methods
		// this can be applied to specific web element using specific conditions 
		// this can be applied to non web elements also
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fname=By.id("input-firstname");
		By lname=By.id("input-lastname");
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement firstname=wait.until(ExpectedConditions.presenceOfElementLocated(fname));
//		firstname.sendKeys("dharm");
//		driver.findElement(lname).sendKeys("tomarg");
		
		waitforpresenceOfElement(fname, 10).sendKeys("ds");
		wairforVisibilityOfElement(lname, 10).sendKeys("indu");
	}
	
	public static WebElement waitforpresenceOfElement(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static WebElement wairforVisibilityOfElement(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
}
