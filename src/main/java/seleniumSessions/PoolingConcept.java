package seleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PoolingConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(5000);
//		By linkedin=By.xpath("//a[contains(@href,'linkedin1')]");
//
//		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5),Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(linkedin)).click();
		
		//WaitFor-iframe 
		
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/application-form/");
		
		driver.findElement(By.cssSelector("div#imageTemplateContainer")).click();
		//Thread.sleep(5000);
		
//		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class)
				.withMessage("time .. element not visible");
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame-one547028434"));
		
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("dharm");
	}

}
