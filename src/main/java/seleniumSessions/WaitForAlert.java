package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new FirefoxDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		//driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//driver.findElement(By.name("alert")).click();
		//driver.findElement(By.name("confirmation")).click();
		driver.findElement(By.name("prompt")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[contains(text(),'Click To Open Window Prompt')]")).click();
		//Alert alert=driver.switchTo().alert();
		//Thread.sleep(2000);
		//System.out.println(alert.getText());
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		//alert.sendKeys("abcd");
		
		
		//acceptAlert(5);
		//dismissAlert(5);
		//String text=getTextAlert(5);
		//System.out.println(text);
		
		sendKeysToAlert(6);
		
	}
	public static Alert waitForJSAlert(int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}

	public static void acceptAlert(int timeout) {
		waitForJSAlert(timeout).accept();
		
	}
	public static String getTextAlert(int timeout) {
		return waitForJSAlert(timeout).getText();
		
	}
	
	public static void dismissAlert(int timeout) {
		waitForJSAlert(timeout).dismiss();
	}
	public static void sendKeysToAlert(int timeout) {
		waitForJSAlert(timeout).sendKeys("hello alert");
	}
	
}
