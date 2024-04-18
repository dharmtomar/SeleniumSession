package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By username = By.name("username1");
		
		Thread.sleep(2000);
		//retryingElement(username, 10).sendKeys("dharmtomar");
		retryingElement(username, 10,1).sendKeys("dharmtomar");

		
		//driver.findElement(username).sendKeys("tomar");
	}

	public static WebElement retryingElement(By locator, int timeout) {
		WebElement element = null;
		int attempt = 0;
		while(attempt<timeout) {
			try {
				element = driver.findElement(locator);
				System.out.println("element found in attempt- " + attempt);
				break;
			} catch (Exception e) {
				System.out.println("element not found in attempt- " + attempt);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			attempt++;
		}
		if(element==null) {
			System.out.println("element not found...tried for "+timeout+" times"+" with the interval of "+500+" Miliseconds");
			throw new BrowserException("No such element");
		}
		return element;
	}
	
	public static WebElement retryingElement(By locator, int timeout,int poolingtime) {
		WebElement element = null;
		int attempt = 0;
		while(attempt<timeout) {
			try {
				element = driver.findElement(locator);
				System.out.println("element found in attempt- " + attempt);
				break;
			} catch (Exception e) {
				System.out.println("element not found in attempt- " + attempt);
				try {
					Thread.sleep(poolingtime*1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			attempt++;
		}
		if(element==null) {
			System.out.println("element not found...tried for "+timeout+" times"+" with the interval of "+poolingtime+" Seconds");
			throw new BrowserException("No such element");
		}
		return element;
	}

}
