package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementRefException {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement element=driver.findElement(By.name("email"));
		
		element.sendKeys("tomar@gmail.com");
		
		driver.navigate().refresh();
		
		//1st way to handle stale element exception- reinitialize the element
		//element=driver.findElement(By.name("email"));
		//element.sendKeys("satvik@gmail.com");
		
		//2nd way is- use proper webdriver wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.pollingEvery(Duration.ofMillis(1000))
				.ignoring(StaleElementReferenceException.class)
				.withMessage("Element not found");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//				wait.pollingEvery(Duration.ofMillis(500))
//				.ignoring(StaleElementReferenceException.class)
//				.withMessage("element not found...");
				
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		
		
		element.sendKeys("satvik@gmail.com");
	}

}
